package sk.fri.bioinf.ehealthcare.model.dto;

import java.util.UUID;

public class MedicineDTO {

    private UUID idMedicine;
    private String name;
    private String activeIngredient;
    private double ingredientAmount;
    private int packageAmount;
    private String notes;
}
