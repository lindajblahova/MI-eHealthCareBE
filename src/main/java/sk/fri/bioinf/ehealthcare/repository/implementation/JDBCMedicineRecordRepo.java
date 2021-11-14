package sk.fri.bioinf.ehealthcare.repository.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import sk.fri.bioinf.ehealthcare.model.MedicineRecord;
import sk.fri.bioinf.ehealthcare.repository.IMedicineRecordRepository;
import sk.fri.bioinf.ehealthcare.repository.mapper.MedicineRecordMapper;

import java.util.List;
import java.util.UUID;

public class JDBCMedicineRecordRepo implements IMedicineRecordRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    private RowMapper<MedicineRecord> medicineRecordRowMapper = new MedicineRecordMapper();

    @Override
    public void saveMedicineRecord(MedicineRecord medicineRecord) {

    }

    @Override
    public List<MedicineRecord> getAllMedicineRecordsByIdPatient(UUID idPatient) {
        return null;
    }
}
