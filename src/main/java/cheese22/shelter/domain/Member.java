package cheese22.shelter.domain;

import javax.persistence.*;

@Entity
public class Member {

    private String first_name;
   private String last_name;
//private String phone_number;
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
    private String email;
//   private String pw;
//   private String location;
////    private String status;

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

  public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
//
 public String getEmail() {
        return email;
   }
//////
   public void setEmail(String email) {
        this.email = email;
    }

//    public String getPhone() {
//        return phone_number ;
//    }

//    public void setPhone(String phone_number) {
//        this.phone_number = phone_number;
//    }
//
    public Long getId() {
        return id;
    }
//
    public void setId(Long id) {
        this.id = id;
    }
//
//    public String getPw() {
//        return pw;
//    }
//
//    public void setPw(String pw) {
//        this.pw = pw;
//    }
//
//    public String getLocation() {
//        return location;
//    }
//
//    public void setLocation(String location) {
//        this.location = location;
//    }

//    public String getStatus() {
//        return status;
//    }

//    public void setStatus(String status) {
//        this.status = status;
//    }
}
