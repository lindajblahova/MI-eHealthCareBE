package sk.fri.bioinf.ehealthcare.repository.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import sk.fri.bioinf.ehealthcare.model.Doctor;
import sk.fri.bioinf.ehealthcare.model.Patient;
import sk.fri.bioinf.ehealthcare.repository.IDoctorRepository;
import sk.fri.bioinf.ehealthcare.repository.mapper.DoctorMapper;

import java.util.List;
import java.util.UUID;

public class JDBCDoctorRepo implements IDoctorRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    private RowMapper<Doctor> doctorRowMapper = new DoctorMapper();

    @Override
    public Doctor getDoctorByIdDoctor(UUID idDoctor) {
        return null;
    }

    @Override
    public Patient getDoctorByIdPerson(String idPerson) {
        return null;
    }

    @Override
    public void saveDoctor(Doctor doctor) {

    }

    @Override
    public List<Doctor> getAllDoctors() {
        return null;
    }
}
