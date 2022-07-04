package src.repository;

import src.Doctor;

import java.util.List;
import java.util.Set;

public interface DoctorRepository {
    public void save(Doctor doctor);

    public Doctor getByPK(int key);

    public boolean update(Doctor doctor);

    public void delete(Doctor doctor);

    public Set<Doctor> getAll();
}
