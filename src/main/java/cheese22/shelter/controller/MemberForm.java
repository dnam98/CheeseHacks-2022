package cheese22.shelter.controller;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class MemberForm {

    private String first_name;
    private String last_name;
    private String phone_number;
    private Long id;
    private String email;
    private String pw;
    private String location;


    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPw() {
        return pw;
    }

    public String getLocation() {
        return location;
    }


    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }


    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public void setLocation(String location) {
        this.location = location;
    }

//    public void setStatus(String status) {
//        this.status = status;
//    }
}