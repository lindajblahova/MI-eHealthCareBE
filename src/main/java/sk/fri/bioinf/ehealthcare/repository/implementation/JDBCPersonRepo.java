package sk.fri.bioinf.ehealthcare.repository.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import sk.fri.bioinf.ehealthcare.model.Person;
import sk.fri.bioinf.ehealthcare.repository.IPersonRepository;
import sk.fri.bioinf.ehealthcare.repository.mapper.PersonMapper;

import java.util.List;

public class JDBCPersonRepo implements IPersonRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    private RowMapper<Person> personRowMapper = new PersonMapper();

    @Override
    public Person getPatientByIdPerson(String idPerson) {
        return null;
    }

    @Override
    public void savePerson(Person patient) {

    }

    @Override
    public List<Person> getAllPersons() {
        return null;
    }
}
