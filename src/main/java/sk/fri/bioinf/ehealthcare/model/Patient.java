package sk.fri.bioinf.ehealthcare.model;

import java.util.Date;
import java.util.LinkedList;
import java.util.UUID;

public class Patient {

    private UUID idPatient;
    private String idPerson;
    private UUID idInsuranceCompany;
    //private LinkedList <Long> idMedicineRecords;
    //private LinkedList <Long> idHospitalizations;

    public Patient(UUID idPatient, String idPerson, UUID idInsuranceCompany) {
        this.idPatient = idPatient;
        this.idPerson = idPerson;
        this.idInsuranceCompany = idInsuranceCompany;
    }

    public Patient(String idPerson, UUID idInsuranceCompany) {
        this.idPerson = idPerson;
        this.idInsuranceCompany = idInsuranceCompany;
    }

    public UUID getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(UUID idPatient) {
        this.idPatient = idPatient;
    }

    public String getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(String idPerson) {
        this.idPerson = idPerson;
    }

    public UUID getIdInsuranceCompany() {
        return idInsuranceCompany;
    }

    public void setIdInsuranceCompany(UUID idInsuranceCompany) {
        this.idInsuranceCompany = idInsuranceCompany;
    }
}
