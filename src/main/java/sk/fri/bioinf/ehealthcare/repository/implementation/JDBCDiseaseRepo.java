package sk.fri.bioinf.ehealthcare.repository.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import sk.fri.bioinf.ehealthcare.model.Disease;
import sk.fri.bioinf.ehealthcare.repository.IDiseaseRepository;
import sk.fri.bioinf.ehealthcare.repository.mapper.DiseaseMapper;

import java.util.List;

@Repository("JDBCDiseaseRepo")
public class JDBCDiseaseRepo implements IDiseaseRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    private RowMapper<Disease> diseaseRowMapper = new DiseaseMapper();

    @Override
    public Disease getDiseaseByCode(long diagnoseCode) {
        return null;
    }

    @Override
    public void saveDisease(Disease disease) {

    }

    @Override
    public List<Disease> getAllDiseases() {
        return null;
    }
}
