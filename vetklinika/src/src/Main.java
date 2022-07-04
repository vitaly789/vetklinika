package src;

import src.command.CommandReader;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        /*
        Doctor doctor1 = new Doctor();
        doctor1.setName("Время");

        Patient patient1 = new Patient();
        patient1.setAlias("Шавка");

        Reception reception1 = new Reception();
        reception1.setDoctorID(doctor1.getID());
        reception1.setPatientID(patient1.getID());

        Reception.receptionCollection.add(reception1);

        Reception.receptionCollection = new HashSet<Reception>();
        Reception.receptionCollection.add(reception1);
        */


        authenticate();
        CommandReader.startReading();

    }
    private static void authenticate() {
        Authentication authentication = new Authentication();
        authentication.authenticate();
    }
}