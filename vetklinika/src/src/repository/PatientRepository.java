package src.repository;

import src.Patient;

import java.util.List;
import java.util.Set;

public interface PatientRepository {
    public void save(Patient patient);

    public Patient getByPK(int key);

    public void update(Patient patient);

    public void delete(Patient patient);

    public Set<Patient> getAll();
}