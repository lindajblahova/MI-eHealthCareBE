package sk.fri.bioinf.ehealthcare.model;

import java.util.Date;
import java.util.LinkedList;
import java.util.UUID;

public class DiseaseRecord {

    private UUID idDiseaseRecord;
    private UUID idDisease;
    private UUID idPatient;
    private Date from;
    private boolean ongoing;
    private Date to;
    private SOI severityOfIllness;
    private String notes;

    public DiseaseRecord(UUID idDiseaseRecord, UUID idDisease, UUID idPatient, Date from,
                         boolean ongoing, Date to, SOI severityOfIllness, String notes) {
        this.idDiseaseRecord = idDiseaseRecord;
        this.idDisease = idDisease;
        this.idPatient = idPatient;
        this.from = from;
        this.ongoing = ongoing;
        this.to = to;
        this.severityOfIllness = severityOfIllness;
        this.notes = notes;
    }

    public DiseaseRecord(UUID idDisease, UUID idPatient, Date from, boolean ongoing, Date to,
                         SOI severityOfIllness, String notes) {
        this.idDisease = idDisease;
        this.idPatient = idPatient;
        this.from = from;
        this.ongoing = ongoing;
        this.to = to;
        this.severityOfIllness = severityOfIllness;
        this.notes = notes;
    }

    public UUID getIdDiseaseRecord() {
        return idDiseaseRecord;
    }

    public void setIdDiseaseRecord(UUID idDiseaseRecord) {
        this.idDiseaseRecord = idDiseaseRecord;
    }

    public UUID getIdDisease() {
        return idDisease;
    }

    public void setIdDisease(UUID idDisease) {
        this.idDisease = idDisease;
    }

    public UUID getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(UUID idPatient) {
        this.idPatient = idPatient;
    }

    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public boolean isOngoing() {
        return ongoing;
    }

    public void setOngoing(boolean ongoing) {
        this.ongoing = ongoing;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
    }

    public SOI getSeverityOfIllness() {
        return severityOfIllness;
    }

    public void setSeverityOfIllness(SOI severityOfIllness) {
        this.severityOfIllness = severityOfIllness;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
