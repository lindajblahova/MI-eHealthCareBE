package sk.fri.bioinf.ehealthcare.repository;

import sk.fri.bioinf.ehealthcare.model.DiseaseRecord;

import java.util.List;
import java.util.UUID;

public interface IDiseaseRecordRepository {

    void saveDiseaseRecord(DiseaseRecord diseaseRecord);
    List<DiseaseRecord> getAllDiseaseRecordsByIdPatient(UUID  idPatient);
}
