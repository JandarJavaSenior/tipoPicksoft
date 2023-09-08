package Model;

import Enam.Gender;

import java.util.List;

public class Student {
    private String name;
    private String lastname;
    private String email;
    private String password;
    private Gender gender;
    private List<Lesson> lessons;


    public Student(String name, String lastname, String email, String password, Gender gender, List<Lesson> lessons) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.lessons = lessons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    @Override
    public String toString() {
        return "Model.Student  " +
                "name  " + name + '\'' +
                "lastname  " + lastname + '\'' +
                "email  " + email + '\'' +
                "password  " + password + '\'' +
                "gender  " + gender ;
    }
}
