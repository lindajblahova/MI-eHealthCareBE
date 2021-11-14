package sk.fri.bioinf.ehealthcare.repository.mapper;

import org.springframework.jdbc.core.RowMapper;

import sk.fri.bioinf.ehealthcare.model.DiseaseRecord;
import sk.fri.bioinf.ehealthcare.model.SOI;
import sk.fri.bioinf.ehealthcare.utils.DBProperties;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DiseaseRecordMapper implements RowMapper<DiseaseRecord> {

    @Override
    public DiseaseRecord mapRow(ResultSet resultSet, int i) throws SQLException {
        return new DiseaseRecord(
                resultSet.getObject(DBProperties.DISEASE_RECORD_ID_DISEASE_RECORD, java.util.UUID.class),
                resultSet.getObject(DBProperties.DISEASE_RECORD_ID_DISEASE, java.util.UUID.class),
                resultSet.getObject(DBProperties.DISEASE_RECORD_ID_PATIENT, java.util.UUID.class),
                resultSet.getDate(DBProperties.DISEASE_RECORD_DATE_FROM),
                resultSet.getBoolean(DBProperties.DISEASE_RECORD_ONGOING),
                resultSet.getDate(DBProperties.DISEASE_RECORD_DATE_TO),
                Enum.valueOf(SOI.class, resultSet.getString(DBProperties.DISEASE_RECORD_SEVERITY_OF_ILLNESS)),
                resultSet.getString(DBProperties.DISEASE_RECORD_NOTES)
        );
    }
}
