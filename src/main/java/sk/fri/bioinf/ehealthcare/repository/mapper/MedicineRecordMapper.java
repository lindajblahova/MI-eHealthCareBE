package sk.fri.bioinf.ehealthcare.repository.mapper;

import org.springframework.jdbc.core.RowMapper;
import sk.fri.bioinf.ehealthcare.model.Medicine;
import sk.fri.bioinf.ehealthcare.model.MedicineRecord;
import sk.fri.bioinf.ehealthcare.utils.DBProperties;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

public class MedicineRecordMapper implements RowMapper<MedicineRecord> {

    @Override
    public MedicineRecord mapRow(ResultSet resultSet, int i) throws SQLException {
        return new MedicineRecord(
                resultSet.getObject(DBProperties.MEDICINE_RECORD_ID_MEDICINE_RECORD, java.util.UUID.class),
                resultSet.getObject(DBProperties.MEDICINE_RECORD_ID_PATIENT, java.util.UUID.class),
                resultSet.getObject(DBProperties.MEDICINE_RECORD_ID_MEDICINE, java.util.UUID.class),
                resultSet.getString(DBProperties.MEDICINE_RECORD_DOSE),
                resultSet.getString(DBProperties.MEDICINE_RECORD_NOTES)
        );
    }
}
