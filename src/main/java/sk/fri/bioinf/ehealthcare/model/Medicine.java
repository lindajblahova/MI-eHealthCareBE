package sk.fri.bioinf.ehealthcare.model;

import java.util.UUID;

public class Medicine {

    private UUID idMedicine;
    private String name;
    private String activeIngredient;
    private double ingredientAmount;
    private int packageAmount;
    private String notes;

    public Medicine(UUID idMedicine, String name, String activeIngredient, double ingredientAmount,
                    int packageAmount, String notes) {
        this.idMedicine = idMedicine;
        this.name = name;
        this.activeIngredient = activeIngredient;
        this.ingredientAmount = ingredientAmount;
        this.packageAmount = packageAmount;
        this.notes = notes;
    }

    public Medicine(String name, String activeIngredient, double ingredientAmount, int packageAmount,
                    String notes) {
        this.name = name;
        this.activeIngredient = activeIngredient;
        this.ingredientAmount = ingredientAmount;
        this.packageAmount = packageAmount;
        this.notes = notes;
    }

    public UUID getIdMedicine() {
        return idMedicine;
    }

    public void setIdMedicine(UUID idMedicine) {
        this.idMedicine = idMedicine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActiveIngredient() {
        return activeIngredient;
    }

    public void setActiveIngredient(String activeIngredient) {
        this.activeIngredient = activeIngredient;
    }

    public double getIngredientAmount() {
        return ingredientAmount;
    }

    public void setIngredientAmount(double ingredientAmount) {
        this.ingredientAmount = ingredientAmount;
    }

    public int getPackageAmount() {
        return packageAmount;
    }

    public void setPackageAmount(int packageAmount) {
        this.packageAmount = packageAmount;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
