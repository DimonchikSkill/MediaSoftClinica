package src.main.java;

import java.text.SimpleDateFormat;
import java.util.Date;
public class PatientCreator {
    private String firstname;
    private String lastname;

    private String patronymic;
    private Date date;
    private int id;
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");


    public PatientCreator(String firstname, String lastname, String patronymic, Date date) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.patronymic = patronymic;
        this.date = date;
    }





    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
    public String getDate() {
        return formatter.format(date);
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
