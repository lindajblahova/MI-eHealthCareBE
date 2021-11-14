package sk.fri.bioinf.ehealthcare.repository.mapper;

import org.springframework.jdbc.core.RowMapper;
import sk.fri.bioinf.ehealthcare.model.DiseaseRecord;
import sk.fri.bioinf.ehealthcare.model.Doctor;
import sk.fri.bioinf.ehealthcare.model.SOI;
import sk.fri.bioinf.ehealthcare.utils.DBProperties;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

public class DoctorMapper implements RowMapper<Doctor> {

    @Override
    public Doctor mapRow(ResultSet resultSet, int i) throws SQLException {
        return new Doctor(
                resultSet.getObject(DBProperties.DOCTOR_ID_DOCTOR, java.util.UUID.class),
                resultSet.getString(DBProperties.DOCTOR_ID_PERSON),
                resultSet.getString(DBProperties.DOCTOR_TITLE),
                resultSet.getString(DBProperties.DOCTOR_SPECIALIZATION)
        );
    }
}
