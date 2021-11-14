package sk.fri.bioinf.ehealthcare.model;

import java.util.Date;
import java.util.UUID;

public class Hospitalization {

    private UUID idHospitalization;
    private UUID idPatient;
    private Date dateFrom;
    private Date dateTo;
    private UUID idResponsibleDoctor;
    private UUID idDiseaseRecord;
    private UUID idRoom;
    private String notes;

    public Hospitalization(UUID idHospitalization, UUID idPatient, Date dateFrom, Date dateTo,
                           UUID idResponsibleDoctor, UUID idDisease, UUID idRoom, String notes) {
        this.idHospitalization = idHospitalization;
        this.idPatient = idPatient;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.idResponsibleDoctor = idResponsibleDoctor;
        this.idDiseaseRecord = idDisease;
        this.idRoom = idRoom;
        this.notes = notes;
    }

    public Hospitalization(UUID idPatient, Date dateFrom, Date dateTo,
                           UUID idResponsibleDoctor, UUID idDisease, UUID idRoom, String notes) {
        this.idPatient = idPatient;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.idResponsibleDoctor = idResponsibleDoctor;
        this.idDiseaseRecord = idDisease;
        this.idRoom = idRoom;
        this.notes = notes;
    }

    public UUID getIdHospitalization() {
        return idHospitalization;
    }

    public void setIdHospitalization(UUID idHospitalization) {
        this.idHospitalization = idHospitalization;
    }

    public UUID getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(UUID idPatient) {
        this.idPatient = idPatient;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public UUID getIdResponsibleDoctor() {
        return idResponsibleDoctor;
    }

    public void setIdResponsibleDoctor(UUID idResponsibleDoctor) {
        this.idResponsibleDoctor = idResponsibleDoctor;
    }

    public UUID getIdDiseaseRecord() {
        return idDiseaseRecord;
    }

    public void setIdDiseaseRecord(UUID idDiseaseRecord) {
        this.idDiseaseRecord = idDiseaseRecord;
    }

    public UUID getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(UUID idRoom) {
        this.idRoom = idRoom;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
