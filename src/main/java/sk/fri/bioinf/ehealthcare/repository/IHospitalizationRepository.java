package sk.fri.bioinf.ehealthcare.repository;

import sk.fri.bioinf.ehealthcare.model.Hospitalization;

import java.util.List;
import java.util.UUID;

public interface IHospitalizationRepository {

    void saveHospitalization(Hospitalization hospitalization);
    List<Hospitalization> getAllHospitalizationsByIdPatient(UUID idPatient);
    List<Hospitalization> getAllHospitalizationsByIdDoctor(UUID idDoctor);
}
