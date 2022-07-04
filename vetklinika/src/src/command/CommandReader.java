package src.command;

import src.Doctor;
import src.Patient;
import src.Reception;
import src.repository.DoctorRepository;
import src.repository.PatientRepository;
import src.repository.ReceptionRepository;
import src.repository.impl.DoctorRepositoryImpl;
import src.repository.impl.PatientRepositoryImpl;
import src.repository.impl.ReceptionRepositoryImpl;

import java.time.Instant;
import java.util.*;

public class CommandReader {
    protected static final PatientRepository patientRepository = PatientRepositoryImpl.getSingleton();
    protected static final DoctorRepository doctorRepository= DoctorRepositoryImpl.getSingleton();
    protected static final ReceptionRepository receptionRepository = ReceptionRepositoryImpl.getSingleton();

    public static int startReading() {
        Scanner s = new Scanner(System.in);
        while (true) {
            String text = s.nextLine();
            int code = CommandReader.readCommand(text);

            if (code == 0) {
                break;
            }
        }
        return 0;
    }

    /**
     * Available commands:
     * - create patient Bochka Dog Akita Artem Ulianin;
     * - print patients;
     * - remove patient Bochka;
     * - update patient Bochka Tocka;
     */

    private static int readCommand(String command) {
        if (command.contains("create patient")) {
            return createPatient(command);
        }

        if (command.contains("print patients")) {
            return viewAllPatients(command);
        }

        if (command.contains("remove patient")) {
            return removePatient(command);
        }

        if (command.contains("update patient")) {
            return updatePatient(command);
        }

        if (command.contains("create doctor")) {
            return createDoctor(command);
        }

        if (command.contains("remove doctor")) {
            return removeDoctor(command);
        }

        if (command.contains("create reception")) {
            return createReception(command);
        }

        if (command.contains("update reception")) {
            return updateReception(command);
        }

        if (command.contains("remove")) {
            return removeReception(command);
        }

        if (command.equals("exit")) {
            return 0;
        }

        System.out.println("Incorrect command");
        return -1;
    }

    private static int createPatient(String command) {
        String[] words = command.split(" ");

        String patientAlias = words[2];
        String patientTypeAnimals = words[3];
        String patientBreed = words[4];
        String patientNameOwner = words[5];
        String patientSurnameOwner = words[6];

        Patient newPatient = new Patient();
        newPatient.setAlias(patientAlias);
        newPatient.setTypeAnimals(patientTypeAnimals);
        newPatient.setBreed(patientBreed);
        newPatient.setNameOwner(patientNameOwner);
        newPatient.setSurnameOwner(patientSurnameOwner);

        patientRepository.save(newPatient);

        return 1;
    }

    private static int viewAllPatients(String command) {
        Set<Patient> patients = patientRepository.getAll();

        for (Patient patient : patients) {
            System.out.printf("Кличка: %s", patient.getAlias());
        };

        return 1;
    }

    private static int updatePatient(String command) {
        String[] words = command.split(" ");

        String patientAlias = words[2];

        Set<Patient> patients = patientRepository.getAll();

        for (int i = 0; i < patients.toArray().length; i++) {
            if (patients.toArray()[i].equals(patientAlias)) {
                patientRepository.getAll().toArray()[i] = words[3];
            }
        }

        return -1;
    }

    private static int removePatient(String command) {
        String[] words = command.split(" ");

        String patientAlias = words[2];
        Set<Patient> patients = patientRepository.getAll();

        for (int i = 0; i < patients.toArray().length; i++) {
            if (patients.toArray()[i].equals(patientAlias)) {
                patientRepository.delete((Patient) patients.toArray()[i]);
            }
        }
        return -1;
    }

    private static int createDoctor(String command) {
        String[] words = command.split(" ");

        String doctorSurname = words[2];
        String doctorName = words[3];
        String doctorSpecialty = words[4];
        String doctorPhone = words[5];
        String doctorWorkExperience = words[6];

        Doctor newDoctor = new Doctor();
        newDoctor.setSurname(doctorSurname);
        newDoctor.setName(doctorName);
        newDoctor.setName(doctorSpecialty);
        newDoctor.setName(doctorPhone);
        newDoctor.setName(doctorWorkExperience);

        doctorRepository.save(newDoctor);

        return 1;
    }

    private static int removeDoctor(String command) {
        String[] words = command.split(" ");

        String doctorSurname = words[2];
        String doctorName = words[3];
        Set<Doctor> doctors = doctorRepository.getAll();

        for (Doctor doctor : doctorRepository.getAll()) {
            if (doctor.getSurname().equals(doctorSurname) && doctor.getName().equals(doctorName)) {
                doctorRepository.delete(doctor);
            }
        }

        return -1;
    }

    private static int createReception(String command) {
        String[] words = command.split(" ");

        String receptionDateTimeReception = words[2];
        String receptionPatientID = words[3];
        String receptionDoctorID = words[4];
        String receptionDiagnosis = words[5];
        String receptionStatus = words[6];

        Reception newReception = new Reception();
        newReception.setDateTimeReception(Instant.parse(receptionDateTimeReception));
        newReception.setPatientID(Long.parseLong(receptionPatientID));
        newReception.setDoctorID(Long.parseLong(receptionDoctorID));
        newReception.setDiagnosis(receptionDiagnosis);
        newReception.setStatus(receptionStatus);

        receptionRepository.save(newReception);

        return 1;
    }

    private static int removeReception(String command) {
        String[] words = command.split(" ");

        String receptionPatientID = words[3];
        String receptionDoctorID = words[4];

        Set<Reception> receptions = receptionRepository.getAll();

        for (Reception reception : receptionRepository.getAll()) {
            if (reception.getPatientID().equals(Long.parseLong(receptionPatientID)) && reception.getDoctorID().equals(Long.parseLong(receptionDoctorID))) {
                receptionRepository.delete(reception);
            }
        }

        return -1;
    }

    private static int updateReception(String command) {
        String[] words = command.split(" ");

        String receptionStatus = words[2];
        Set<Reception> receptions = receptionRepository.getAll();

        for (int i = 0; i < receptions.toArray().length; i++) {
            if (receptions.toArray()[i].equals(receptionStatus)) {
                receptionRepository.getAll().toArray()[i] = words[3];
            }
        }

        return -1;

    }
}