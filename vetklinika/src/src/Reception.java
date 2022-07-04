package src;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.*;


public class Reception {

    private Long ID;
    private Instant dateTimeReception;
    private Long patientID;
    private Long doctorID;
    private String diagnosis;
    private String status;

    private Patient patient;
    private Doctor doctor;

    private static long idSequence = 0; // счетчик для id

    public static Set<Reception> receptionCollection; // список с приемом

    public static Set<Reception> getReceptionCollection() {
        return receptionCollection;
    }


    public static void setReceptionCollection(Set<Reception> receptionCollection) {
        Reception.receptionCollection = receptionCollection;
    }

    public Reception() {
        this.ID = ++idSequence;
        this.dateTimeReception = Instant.now();
    }

    public Instant getDateTimeReception() {
        return dateTimeReception;
    }

    public void setDateTimeReception(Instant dateTimeReception) {
        this.dateTimeReception = dateTimeReception;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Long getPatientID() {
        return patientID;
    }

    public void setPatientID(Long patientID) {
        this.patientID = patientID;
    }

    public Long getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(Long doctorID) {
        this.doctorID = doctorID;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }


}
