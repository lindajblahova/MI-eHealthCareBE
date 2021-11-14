package sk.fri.bioinf.ehealthcare.utils;

public class DBProperties {

    public static final String PERSON_IDENTIFICATION_NUMBER = "identification_number";
    public static final String PERSON_FIRSTNAME = "firstname";
    public static final String PERSON_LASTNAME = "lastname";
    public static final String PERSON_DATE_OF_BIRTH = "date_of_birth";
    public static final String PERSON_STREET = "street";
    public static final String PERSON_STREET_NUMBER = "street_number";
    public static final String PERSON_CITY = "city";
    public static final String PERSON_STATE = "state";
    public static final String PERSON_TELEPHONE_NUMBER = "telephone_number";
    public static final String PERSON_EMAIL = "email";
    public static final String PERSON_CONTACT_PERSON_FIRSTNAME = "contact_person_firstname";
    public static final String PERSON_CONTACT_PERSON_LASTNAME = "contact_person_lastname";
    public static final String PERSON_CONTACT_PERSON_TELEPHONE_NUMBER = "contact_person_telephone_number";
    public static final String PERSON_CONTACT_PERSON_EMAIL = "contact_person_email";

    public static final String PATIENT_ID_PATIENT = "id_patient";
    public static final String PATIENT_ID_PERSON = "id_person";
    public static final String PATIENT_ID_INSURANCE_COMPANY = "id_insurance_company";

    public static final String DOCTOR_ID_DOCTOR = "id_doctor";
    public static final String DOCTOR_ID_PERSON = "id_person";
    public static final String DOCTOR_TITLE = "title";
    public static final String DOCTOR_SPECIALIZATION = "specialization";

    public static final String ROOM_ID_ROOM = "id_room";
    public static final String ROOM_FLOOR_NUMBER = "floor_number";
    public static final String ROOM_ROOM_NUMBER = "room_number";
    public static final String ROOM_CAPACITY = "capacity";
    public static final String ROOM_GENDER = "gender";

    public static final String DISEASE_ID_DISEASE = "id_disease";
    public static final String DISEASE_NAME = "name";
    public static final String DISEASE_DIAGNOSE_CODE = "diagnose_code";

    public static final String DISEASE_RECORD_ID_DISEASE_RECORD = "id_disease_record";
    public static final String DISEASE_RECORD_ID_DISEASE = "id_disease";
    public static final String DISEASE_RECORD_ID_PATIENT = "id_patient";
    public static final String DISEASE_RECORD_SYMPTOMS = "symptoms";
    public static final String DISEASE_RECORD_DATE_FROM = "date_from";
    public static final String DISEASE_RECORD_ONGOING = "ongoing";
    public static final String DISEASE_RECORD_DATE_TO = "date_to";
    public static final String DISEASE_RECORD_SEVERITY_OF_ILLNESS = "severity_of_illness";
    public static final String DISEASE_RECORD_NOTES = "notes";

    public static final String HOSPITALIZATION_ID_HOSPITALIZATION = "id_hospitalization";
    public static final String HOSPITALIZATION_ID_PATIENT = "id_patient";
    public static final String HOSPITALIZATION_DATE_FROM = "date_from";
    public static final String HOSPITALIZATION_DATE_TO = "date_to";
    public static final String HOSPITALIZATION_ID_RESPONSIBLE_DOCTOR = "id_responsible_doctor";
    public static final String HOSPITALIZATION_ID_DISEASE_RECORD = "id_disease_record";
    public static final String HOSPITALIZATION_ID_ROOM = "id_room";
    public static final String HOSPITALIZATION_NOTES = "notes";

    public static final String MEDICINE_ID_MEDICINE = "id_medicine";
    public static final String MEDICINE_NAME = "name";
    public static final String MEDICINE_ACTIVE_INGREDIENT = "active_ingredient";
    public static final String MEDICINE_INGREDIENT_AMOUNT = "ingredient_amount";
    public static final String MEDICINE_PACKAGE_AMOUNT = "package_amount";
    public static final String MEDICINE_NOTES = "notes";

    public static final String MEDICINE_RECORD_ID_MEDICINE_RECORD = "id_medicine_record";
    public static final String MEDICINE_RECORD_ID_PATIENT = "id_patient";
    public static final String MEDICINE_RECORD_ID_MEDICINE = "id_medicine";
    public static final String MEDICINE_RECORD_DOSE = "dose";
    public static final String MEDICINE_RECORD_NOTES = "notes";

}
