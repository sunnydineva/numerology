package com.numerology.be.entity;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;


@Entity
@Table(name = "USERS")
public class User {
    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "FIRST_NAME", length = 45, nullable = false)
    private String firstName;

    @Column(name = "LAST_NAME", length = 45, nullable = false)
    private String lastName;

    @Column(name = "EMAIL",length = 128, nullable = false, unique = true)
    private String email;

    @Column(name = "BIRTHDATE",nullable = false)
    private Integer birthdate;

    @Column(name = "CREATED_AT", nullable = false, updatable = false)
    private Timestamp createdAt;

    @Column(name = "UPDATED_AT", nullable = false, updatable = false)
    private Timestamp updatedAt;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<NumerologyResult> numerologyResults;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public Integer getBirthdate(){
        return birthdate;
    }
    public void setBirthdate(Integer birthdate){
        this.birthdate = birthdate;
    }

    public Timestamp getCreatedAt(){
        return createdAt;
    }
    public void setCreatedAt(Timestamp createdAt){
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt(){
        return updatedAt;
    }
    public void setUpdatedAt(Timestamp updatedAt){
        this.updatedAt = updatedAt;
    }

    public List getNumerologyResults(){
        return numerologyResults;
    }
    public void setNumerologyResults(List numerologyResults){
        this.numerologyResults = numerologyResults;
    }
}
