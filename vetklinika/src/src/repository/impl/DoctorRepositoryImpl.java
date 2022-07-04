package src.repository.impl;

import src.Doctor;
import src.Patient;
import src.repository.DoctorRepository;
import src.repository.PatientRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DoctorRepositoryImpl implements DoctorRepository {
    private static final Set<Doctor> DOCTORS = new HashSet<Doctor>();

    private static final DoctorRepositoryImpl SINGLETON = new DoctorRepositoryImpl();

    private DoctorRepositoryImpl() {

    }

    public static DoctorRepository getSingleton() {
        return SINGLETON;
    }

    @Override
    public void save(Doctor doctor) {
        DOCTORS.add(doctor);
    }

    @Override
    public Doctor getByPK(int key) {
        return null;
    }

    @Override
    public boolean update(Doctor doctor) {
        return false;
    }

    @Override
    public void delete(Doctor doctor) {
        DOCTORS.remove(doctor);
    }

    @Override
    public Set<Doctor> getAll() {
        return DOCTORS;
    }
}