package src;

import java.util.HashSet;
import java.util.Set;

public class Doctor {


    private Long ID;
    private String surname;
    private String name;
    private String specialty;
    private String phone;
    private Integer workExperience;

    public Set<Reception> reception;

    private static long idSequence = 0; // счетчик для id

    public Doctor() {
        this.ID = ++idSequence;
        reception = new HashSet<Reception>();
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(Integer workExperience) {
        this.workExperience = workExperience;
    }





}
