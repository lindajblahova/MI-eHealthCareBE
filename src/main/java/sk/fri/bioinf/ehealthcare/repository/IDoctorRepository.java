package sk.fri.bioinf.ehealthcare.repository;

import sk.fri.bioinf.ehealthcare.model.Doctor;
import sk.fri.bioinf.ehealthcare.model.Patient;

import java.util.List;
import java.util.UUID;

public interface IDoctorRepository {

    Doctor getDoctorByIdDoctor(UUID idDoctor);
    Patient getDoctorByIdPerson(String idPerson);
    void saveDoctor(Doctor doctor);
    List<Doctor> getAllDoctors();
}
