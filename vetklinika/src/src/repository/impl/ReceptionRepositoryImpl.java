package src.repository.impl;

import src.Reception;
import src.repository.ReceptionRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReceptionRepositoryImpl implements ReceptionRepository {

    private static final Set<Reception> RECEPTIONS = new HashSet<Reception>();

    private static final ReceptionRepositoryImpl SINGLETON = new ReceptionRepositoryImpl();

    private ReceptionRepositoryImpl() {

    }

    public static ReceptionRepository getSingleton() {
        return SINGLETON;
    }

    @Override
    public void save(Reception reception) {
        RECEPTIONS.add(reception);
    }

    @Override
    public Reception getByPK(int key) {
        return null;
    }

    @Override
    public boolean update(Reception reception) {
        return false;
    }

    @Override
    public void delete(Reception reception) {
        RECEPTIONS.remove(reception);
    }

    @Override
    public Set<Reception> getAll() {
        return RECEPTIONS;
    }
}