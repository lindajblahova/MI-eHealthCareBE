package sk.fri.bioinf.ehealthcare.repository.mapper;

import org.springframework.jdbc.core.RowMapper;
import sk.fri.bioinf.ehealthcare.model.Disease;
import sk.fri.bioinf.ehealthcare.utils.DBProperties;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DiseaseMapper implements RowMapper<Disease> {

    @Override
    public Disease mapRow(ResultSet resultSet, int i) throws SQLException {
        return new Disease(
                resultSet.getObject(DBProperties.DISEASE_ID_DISEASE, java.util.UUID.class),
                resultSet.getString(DBProperties.DISEASE_NAME),
                resultSet.getLong(DBProperties.DISEASE_DIAGNOSE_CODE)
        );
    }
}
