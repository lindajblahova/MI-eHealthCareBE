package sk.fri.bioinf.ehealthcare.model;

import java.util.UUID;

public class MedicineRecord {

    private UUID idMedicineRecord;
    private UUID idPatient;
    private UUID idMedicine;
    private String dose;
    private String notes;

    public MedicineRecord(UUID idMedicineRecord, UUID idPatient, UUID idMedicine, String dose, String notes) {
        this.idMedicineRecord = idMedicineRecord;
        this.idPatient = idPatient;
        this.idMedicine = idMedicine;
        this.dose = dose;
        this.notes = notes;
    }

    public MedicineRecord(UUID idPatient, UUID idMedicine, String dose, String notes) {
        this.idPatient = idPatient;
        this.idMedicine = idMedicine;
        this.dose = dose;
        this.notes = notes;
    }

    public UUID getIdMedicineRecord() {
        return idMedicineRecord;
    }

    public void setIdMedicineRecord(UUID idMedicineRecord) {
        this.idMedicineRecord = idMedicineRecord;
    }

    public UUID getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(UUID idPatient) {
        this.idPatient = idPatient;
    }

    public UUID getIdMedicine() {
        return idMedicine;
    }

    public void setIdMedicine(UUID idMedicine) {
        this.idMedicine = idMedicine;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
