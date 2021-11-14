package sk.fri.bioinf.ehealthcare.model.dto;

import java.util.Date;
import java.util.UUID;

public class HospitalizationDTO {

    private UUID idHospitalization;
    private UUID idPatient;
    private Date dateFrom;
    private Date dateTo;
    private UUID idResponsibleDoctor;
    private UUID idDisease;
    private UUID idRoom;
    private String notes;
}
