package sk.fri.bioinf.ehealthcare.model.dto;

import sk.fri.bioinf.ehealthcare.model.SOI;

import java.util.Date;
import java.util.UUID;

public class DiseaseRecordDTO {

    private UUID idDiseaseRecord;
    private UUID idDisease;
    private UUID idPatient;
    private Date from;
    private boolean ongoing;
    private Date to;
    private SOI severityOfIllness;
    private String notes;
}
