package sk.fri.bioinf.ehealthcare.repository;

import sk.fri.bioinf.ehealthcare.model.Medicine;

import java.util.List;
import java.util.UUID;

public interface IMedicineRepository {

    Medicine getMedicineByIdMedicine(UUID idMedicine);
    Medicine getMedicineByName(String name);
    void saveMedicine(Medicine medicine);
    List<Medicine> getAllMedicines();
}
