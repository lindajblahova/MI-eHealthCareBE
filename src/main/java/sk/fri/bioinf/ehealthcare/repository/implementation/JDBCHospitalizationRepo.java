package sk.fri.bioinf.ehealthcare.repository.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import sk.fri.bioinf.ehealthcare.model.Hospitalization;
import sk.fri.bioinf.ehealthcare.repository.IHospitalizationRepository;
import sk.fri.bioinf.ehealthcare.repository.mapper.HospitalizationMapper;

import java.util.List;
import java.util.UUID;

public class JDBCHospitalizationRepo implements IHospitalizationRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    private RowMapper<Hospitalization> hospitalizationRowMapper = new HospitalizationMapper();

    @Override
    public void saveHospitalization(Hospitalization hospitalization) {

    }

    @Override
    public List<Hospitalization> getAllHospitalizationsByIdPatient(UUID idPatient) {
        return null;
    }

    @Override
    public List<Hospitalization> getAllHospitalizationsByIdDoctor(UUID idDoctor) {
        return null;
    }
}
