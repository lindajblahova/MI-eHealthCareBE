package sk.fri.bioinf.ehealthcare.repository;

import sk.fri.bioinf.ehealthcare.model.Person;

import java.util.List;
import java.util.UUID;

public interface IPersonRepository {

    Person getPatientByIdPerson(String idPerson);
    void savePerson(Person patient);
    List<Person> getAllPersons();
}
