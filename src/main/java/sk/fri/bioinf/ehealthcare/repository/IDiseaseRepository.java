package sk.fri.bioinf.ehealthcare.repository;

import sk.fri.bioinf.ehealthcare.model.Disease;
import java.util.List;

public interface IDiseaseRepository {

    Disease getDiseaseByCode(long diagnoseCode);
    void saveDisease(Disease disease);
    List<Disease> getAllDiseases();
}
