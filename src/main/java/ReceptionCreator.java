package src.main.java;

public class ReceptionCreator {
    private DoctorCreator doctor;
    private PatientCreator patient;
    private String date;
    private String status;

    public ReceptionCreator(DoctorCreator doctor, PatientCreator patient, String date, String status) {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
        this.status = status;
    }

    public DoctorCreator getDoctor() {
        return doctor;
    }

    public void setDoctor(DoctorCreator doctor) {
        this.doctor = doctor;
    }

    public PatientCreator getPatient() {
        return patient;
    }

    public void setPatient(PatientCreator patient) {
        this.patient = patient;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
