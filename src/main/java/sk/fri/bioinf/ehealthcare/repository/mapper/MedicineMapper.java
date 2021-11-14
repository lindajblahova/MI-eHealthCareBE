package sk.fri.bioinf.ehealthcare.repository.mapper;

import org.springframework.jdbc.core.RowMapper;
import sk.fri.bioinf.ehealthcare.model.Medicine;
import sk.fri.bioinf.ehealthcare.utils.DBProperties;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MedicineMapper implements RowMapper<Medicine> {

    @Override
    public Medicine mapRow(ResultSet resultSet, int i) throws SQLException {
        return new Medicine(
                resultSet.getObject(DBProperties.MEDICINE_ID_MEDICINE, java.util.UUID.class),
                resultSet.getString(DBProperties.MEDICINE_NAME),
                resultSet.getString(DBProperties.MEDICINE_ACTIVE_INGREDIENT),
                resultSet.getDouble(DBProperties.MEDICINE_INGREDIENT_AMOUNT),
                resultSet.getInt(DBProperties.MEDICINE_PACKAGE_AMOUNT),
                resultSet.getString(DBProperties.MEDICINE_NOTES)
        );
    }
}

