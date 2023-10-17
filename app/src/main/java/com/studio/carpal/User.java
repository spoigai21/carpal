package com.studio.carpal;

public class User {
    String fullName, parentFullName, schoolName, dateOfBirth, email, gender, password;
    Integer mobile;


    public User(String fullName, String parentFullName, String schoolName, String dateOfBirth, String email, String gender, String password, Integer mobile) {
        this.fullName = fullName;
        this.parentFullName = parentFullName;
        this.schoolName = schoolName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.gender = gender;
        this.password = password;
        this.mobile = mobile;
    }

    public User() {}


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getParentFullName() {
        return parentFullName;
    }

    public void setParentFullName(String parentFullName) {
        this.parentFullName = parentFullName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getMobile() {
        return mobile;
    }

    public void setMobile(Integer mobile) {
        this.mobile = mobile;
    }
}

