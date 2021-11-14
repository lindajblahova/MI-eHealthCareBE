package sk.fri.bioinf.ehealthcare.repository.mapper;

import org.springframework.jdbc.core.RowMapper;
import sk.fri.bioinf.ehealthcare.model.Person;
import sk.fri.bioinf.ehealthcare.utils.DBProperties;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class PersonMapper implements RowMapper<Person> {

    @Override
    public Person mapRow(ResultSet resultSet, int i) throws SQLException {
        return new Person(
                resultSet.getString(DBProperties.PERSON_IDENTIFICATION_NUMBER),
                resultSet.getString(DBProperties.PERSON_FIRSTNAME),
                resultSet.getString(DBProperties.PERSON_LASTNAME),
                resultSet.getDate(DBProperties.PERSON_DATE_OF_BIRTH),
                resultSet.getString(DBProperties.PERSON_STREET),
                resultSet.getString(DBProperties.PERSON_STREET_NUMBER),
                resultSet.getString(DBProperties.PERSON_CITY),
                resultSet.getString(DBProperties.PERSON_STATE),
                resultSet.getString(DBProperties.PERSON_TELEPHONE_NUMBER),
                resultSet.getString(DBProperties.PERSON_EMAIL),
                resultSet.getString(DBProperties.PERSON_CONTACT_PERSON_FIRSTNAME),
                resultSet.getString(DBProperties.PERSON_CONTACT_PERSON_LASTNAME),
                resultSet.getString(DBProperties.PERSON_CONTACT_PERSON_TELEPHONE_NUMBER),
                resultSet.getString(DBProperties.PERSON_CONTACT_PERSON_EMAIL)
        );
    }
}
