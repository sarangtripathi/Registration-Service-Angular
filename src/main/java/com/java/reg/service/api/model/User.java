package com.java.reg.service.api.model;

import jakarta.persistence.*;

@Entity
@Table(name="USER_REG_TBL")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String name;
    private String email;
    private int experience;
    private String domain;

    public User(int id, String name, String email, int experience, String domain) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.experience = experience;
        this.domain = domain;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", experience=" + experience +
                ", domain='" + domain + '\'' +
                '}';
    }
}