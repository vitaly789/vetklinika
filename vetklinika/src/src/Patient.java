package src;

import java.time.Instant;
import java.util.*;

public class Patient {

    private Long ID;
    private String alias;
    private String typeAnimals;
    private String breed;
    private String nameOwner;
    private String surnameOwner;
    private Instant dateRegistration;

    public Collection<Reception> receptionListPatient;

    private static long idSequence = 0; // счетчик для id

    public Patient() {
        this.ID = ++idSequence;
        this.dateRegistration = Instant.now();
        this.receptionListPatient = new HashSet<Reception>();
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getTypeAnimals() {
        return typeAnimals;
    }

    public void setTypeAnimals(String typeAnimals) {
        this.typeAnimals = typeAnimals;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public String getSurnameOwner() {
        return surnameOwner;
    }

    public void setSurnameOwner(String surnameOwner) {
        this.surnameOwner = surnameOwner;
    }

    public Instant getDateRegistration() {
        return dateRegistration;
    }

    public void setDateRegistration(Instant dateRegistration) {
        this.dateRegistration = dateRegistration;
    }

    public Collection<Reception> getReceptionListPatient() {
        return receptionListPatient;
    }

    public void setReceptionListPatient(Collection<Reception> receptionListPatient) {
        this.receptionListPatient = receptionListPatient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return Objects.equals(ID, patient.ID) && Objects.equals(alias, patient.alias) && Objects.equals(typeAnimals, patient.typeAnimals) && Objects.equals(breed, patient.breed) && Objects.equals(nameOwner, patient.nameOwner) && Objects.equals(surnameOwner, patient.surnameOwner) && Objects.equals(dateRegistration, patient.dateRegistration) && Objects.equals(receptionListPatient, patient.receptionListPatient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, alias, typeAnimals, breed, nameOwner, surnameOwner, dateRegistration, receptionListPatient);
    }



}
