package sk.fri.bioinf.ehealthcare.model;

import java.util.LinkedList;
import java.util.UUID;

public class Disease {

    private UUID idDisease;
    private String name;
    private long diagnoseCode;

    public Disease(UUID idDisease, String name, long diagnoseCode) {
        this.idDisease = idDisease;
        this.name = name;
        this.diagnoseCode = diagnoseCode;
    }

    public Disease(String name, long diagnoseCode) {
        this.name = name;
        this.diagnoseCode = diagnoseCode;
    }

    public UUID getIdDisease() {
        return idDisease;
    }

    public void setIdDisease(UUID idDisease) {
        this.idDisease = idDisease;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getDiagnoseCode() {
        return diagnoseCode;
    }

    public void setDiagnoseCode(long diagnoseCode) {
        this.diagnoseCode = diagnoseCode;
    }
}
