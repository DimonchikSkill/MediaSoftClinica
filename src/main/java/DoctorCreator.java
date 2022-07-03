package src.main.java;

public class DoctorCreator {
    private String firstname;
    private String lastname;
    private String patronymic;
    private String post;

    public DoctorCreator(String firstname, String lastname, String patronymic, String post) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.patronymic = patronymic;
        this.post = post;
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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void getDoctorInfo(){
        System.out.println(firstname+" "+lastname+" "+post);
    }
}
