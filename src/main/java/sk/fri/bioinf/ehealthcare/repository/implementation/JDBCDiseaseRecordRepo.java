package sk.fri.bioinf.ehealthcare.repository.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import sk.fri.bioinf.ehealthcare.model.DiseaseRecord;
import sk.fri.bioinf.ehealthcare.repository.IDiseaseRecordRepository;
import sk.fri.bioinf.ehealthcare.repository.mapper.DiseaseRecordMapper;

import java.util.List;
import java.util.UUID;

@Repository("JDBCDiseaseRecordRepo")
public class JDBCDiseaseRecordRepo implements IDiseaseRecordRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    private RowMapper<DiseaseRecord> diseaseRecordRowMapper = new DiseaseRecordMapper();

    @Override
    public void saveDiseaseRecord(DiseaseRecord diseaseRecord) {

    }

    @Override
    public List<DiseaseRecord> getAllDiseaseRecordsByIdPatient(UUID idPatient) {
        return null;
    }
}
