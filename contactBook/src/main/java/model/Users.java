package model;

import javax.naming.Name;
import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "userData")
public class Users {
    @Id
    @GeneratedValue(generator = "UUID")
    @Column(name="id",nullable = false)
    private UUID id;

    @Column(name="Firstname")
    private String firstname;

    @Column(name ="Age")
    private int  age;

    @Column(name="Email")
    private String email;

    @Column(name="Address")
    private String address;

    @Column(name = "PhoneNumber")
    private int pnum;

    public Users(String firstname, int age, String email, String address, int pnum) {
        this.firstname = firstname;
        this.age = age;
        this.email = email;
        this.address = address;
        this.pnum = pnum;
    }

    public Users() {}

    public UUID getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPnum() {
        return pnum;
    }

    public void setPnum(int pnum) {
        this.pnum = pnum;
    }
}
