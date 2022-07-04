package src.repository;

import src.Patient;
import src.Reception;

import java.util.List;
import java.util.Set;

public interface ReceptionRepository {
    public void save(Reception reception);

    public Reception getByPK(int key);

    public boolean update(Reception reception);

    public void delete(Reception reception);

    public Set<Reception> getAll();
}
