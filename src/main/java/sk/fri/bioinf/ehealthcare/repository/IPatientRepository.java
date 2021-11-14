package sk.fri.bioinf.ehealthcare.repository;

import sk.fri.bioinf.ehealthcare.model.Patient;

import java.util.List;
import java.util.UUID;

public interface IPatientRepository {

    Patient getPatientByIdPatient(UUID idPatient);
    Patient getPatientByIdPerson(String idPerson);
    void savePatient(Patient patient);
    List<Patient> getAllPatients();
}
