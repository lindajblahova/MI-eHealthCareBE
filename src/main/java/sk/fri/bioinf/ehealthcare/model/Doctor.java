package sk.fri.bioinf.ehealthcare.model;

import java.util.Date;
import java.util.UUID;

public class Doctor {

    private UUID idDoctor;
    private String idPerson;
    private String title;
    private String specialization;

    public Doctor(UUID idDoctor, String idPerson, String title, String specialization) {
        this.idDoctor = idDoctor;
        this.idPerson = idPerson;
        this.title = title;
        this.specialization = specialization;
    }

    public Doctor(String idPerson, String title, String specialization) {
        this.idPerson = idPerson;
        this.title = title;
        this.specialization = specialization;
    }

    public UUID getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(UUID idDoctor) {
        this.idDoctor = idDoctor;
    }

    public String getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(String idPerson) {
        this.idPerson = idPerson;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
