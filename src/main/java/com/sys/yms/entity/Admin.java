package com.sys.yms.entity;

import java.io.Serializable;

/**
 * Admin对应的实体类
 */
public class Admin implements Serializable {
    private Integer id;
    private String account;
    private String password;
    private String headPhoto;
    private String name;
    private String phone;
    private String gender;
    private Integer age;

    public Admin() {
    }

    public Admin(Integer id, String account, String password, String headPhoto, String name,
                 String phone, String gender, Integer age) {
        this.id = id;
        this.account = account;
        this.password = password;
        this.headPhoto = headPhoto;
        this.name = name;
        this.phone = phone;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", headPhoto='" + headPhoto + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHeadPhoto() {
        return headPhoto;
    }

    public void setHeadPhoto(String headPhoto) {
        this.headPhoto = headPhoto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
