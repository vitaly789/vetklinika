package src.repository.impl;

import src.Patient;
import src.repository.PatientRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PatientRepositoryImpl implements PatientRepository {

    private static final Set<Patient> PATIENTS = new HashSet<Patient>();

    private static final PatientRepositoryImpl SINGLETON = new PatientRepositoryImpl();

    private PatientRepositoryImpl() {

    }

    public static PatientRepository getSingleton() {
        return SINGLETON;
    }

    @Override
    public void save(Patient patient) {
        PATIENTS.add(patient);
    }

    @Override
    public Patient getByPK(int key) {
        return null;
    }

    @Override
    public void update(Patient patient) {

    }

    @Override
    public void delete(Patient patient) {
        PATIENTS.remove(patient);
    }

    @Override
    public Set<Patient> getAll() {
        return PATIENTS;
    }

}