package sk.fri.bioinf.ehealthcare.repository.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import sk.fri.bioinf.ehealthcare.model.Medicine;
import sk.fri.bioinf.ehealthcare.repository.IMedicineRepository;
import sk.fri.bioinf.ehealthcare.repository.mapper.MedicineMapper;

import java.util.List;
import java.util.UUID;

public class JDBCMedicineRepo implements IMedicineRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    private RowMapper<Medicine> medicineRowMapper = new MedicineMapper();

    @Override
    public Medicine getMedicineByIdMedicine(UUID idMedicine) {
        return null;
    }

    @Override
    public Medicine getMedicineByName(String name) {
        return null;
    }

    @Override
    public void saveMedicine(Medicine medicine) {

    }

    @Override
    public List<Medicine> getAllMedicines() {
        return null;
    }
}
