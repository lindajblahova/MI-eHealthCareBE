package sk.fri.bioinf.ehealthcare.repository.mapper;

import org.springframework.jdbc.core.RowMapper;
import sk.fri.bioinf.ehealthcare.model.Hospitalization;
import sk.fri.bioinf.ehealthcare.utils.DBProperties;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.UUID;

public class HospitalizationMapper implements RowMapper<Hospitalization> {

    @Override
    public Hospitalization mapRow(ResultSet resultSet, int i) throws SQLException {
        return new Hospitalization(
                resultSet.getObject(DBProperties.HOSPITALIZATION_ID_HOSPITALIZATION, java.util.UUID.class),
                resultSet.getObject(DBProperties.HOSPITALIZATION_ID_PATIENT, java.util.UUID.class),
                resultSet.getDate(DBProperties.HOSPITALIZATION_DATE_FROM),
                resultSet.getDate(DBProperties.HOSPITALIZATION_DATE_TO),
                resultSet.getObject(DBProperties.HOSPITALIZATION_ID_RESPONSIBLE_DOCTOR, java.util.UUID.class),
                resultSet.getObject(DBProperties.HOSPITALIZATION_ID_DISEASE_RECORD, java.util.UUID.class),
                resultSet.getObject(DBProperties.HOSPITALIZATION_ID_ROOM, java.util.UUID.class),
                resultSet.getString(DBProperties.HOSPITALIZATION_NOTES)
        );
    }
}
