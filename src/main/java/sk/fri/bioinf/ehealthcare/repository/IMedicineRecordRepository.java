package sk.fri.bioinf.ehealthcare.repository;

import sk.fri.bioinf.ehealthcare.model.MedicineRecord;

import java.util.List;
import java.util.UUID;

public interface IMedicineRecordRepository {

    void saveMedicineRecord(MedicineRecord medicineRecord);
    List<MedicineRecord> getAllMedicineRecordsByIdPatient(UUID idPatient);
}
