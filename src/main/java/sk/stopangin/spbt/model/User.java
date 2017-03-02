package sk.stopangin.spbt.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.io.Serializable;
import java.util.Date;


@Entity(name = "User")
public class User implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String lastName;
    private String username;
    private String picturePathIn;
    private String picturePathOut;
    private String gender;
    private String possition;
    private String sallary;
    private String age;
    private Date date;
    @Lob
    private byte[] photo;
    private String address;
    private String email;
    private String phone;
    private String city;
    private String description;


    public User(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public User(String name, String lastName, String gender, String email, String city) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.city = city;
    }

    public User(String name, String lastName, String gender, String address, String email,
                String phone, String city, String description, String sallary, String possition) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.city = city;
        this.description = description;
        this.possition = possition;
        this.sallary = sallary;
    }

    public User() {

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPicturePathIn() {
        return picturePathIn;
    }

    public void setPicturePathIn(String picturePathIn) {
        this.picturePathIn = picturePathIn;
    }
    public String getPicturePathOut() {
        return picturePathOut;
    }

    public void setPicturePathOut(String picturePathOut) {
        this.picturePathOut = picturePathOut;
    }

    public String getPossition() {
        return possition;
    }

    public void setPossition(String possition) {
        this.possition = possition;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSallary() {
        return sallary;
    }

    public void setSallary(String sallary) {
        this.sallary = sallary;
    }
}
