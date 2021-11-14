package sk.fri.bioinf.ehealthcare.repository.mapper;

import org.springframework.jdbc.core.RowMapper;
import sk.fri.bioinf.ehealthcare.model.Patient;
import sk.fri.bioinf.ehealthcare.utils.DBProperties;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PatientMapper implements RowMapper<Patient> {

    @Override
    public Patient mapRow(ResultSet resultSet, int i) throws SQLException {
        return new Patient(
                resultSet.getObject(DBProperties.PATIENT_ID_PATIENT, java.util.UUID.class),
                resultSet.getString(DBProperties.PATIENT_ID_PERSON),
                resultSet.getObject(DBProperties.PATIENT_ID_INSURANCE_COMPANY, java.util.UUID.class)
        );
    }
}
