package sk.fri.bioinf.ehealthcare.repository.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import sk.fri.bioinf.ehealthcare.model.Patient;
import sk.fri.bioinf.ehealthcare.repository.IPatientRepository;
import sk.fri.bioinf.ehealthcare.repository.mapper.PatientMapper;

import java.util.List;
import java.util.UUID;

public class JDBCPatientRepo implements IPatientRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    private RowMapper<Patient> patientRowMapper = new PatientMapper();

    @Override
    public Patient getPatientByIdPatient(UUID idPatient) {
        return null;
    }

    @Override
    public Patient getPatientByIdPerson(String idPerson) {
        return null;
    }

    @Override
    public void savePatient(Patient patient) {

    }

    @Override
    public List<Patient> getAllPatients() {
        return null;
    }
}
