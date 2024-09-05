package com.numerology.be.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "NUMEROLOGY_RESULTS")
public class NumerologyResult {
    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID", nullable = false)
    @JsonBackReference
    private User user;

    @Column(name = "LIFE_PATH_NUMBER", nullable = false)
    private Integer lifePathNumber;

    @Column(name = "EXPRESSION_NUMBER", nullable = false)
    private Integer expressionNumber;

    @Column(name = "SOUL_URGE_NUMBER", nullable = false)
    private Integer soulUrgeNumber;

    @Column(name = "PERSONALITY_NUMBER", nullable = false)
    private Integer personalityNumber;

    @Column(name = "CREATED_AT", nullable = false, updatable = false)
    private Timestamp createdAt;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getLifePathNumber() {
        return lifePathNumber;
    }

    public void setLifePathNumber(Integer lifePathNumber) {
        this.lifePathNumber = lifePathNumber;
    }

    public Integer getExpressionNumber() {
        return expressionNumber;
    }

    public void setExpressionNumber(Integer expressionNumber) {
        this.expressionNumber = expressionNumber;
    }

    public Integer getSoulUrgeNumber() {
        return soulUrgeNumber;
    }

    public void setSoulUrgeNumber(Integer soulUrgeNumber) {
        this.soulUrgeNumber = soulUrgeNumber;
    }

    public Integer getPersonalityNumber() {
        return personalityNumber;
    }

    public void setPersonalityNumber(Integer personalityNumber) {
        this.personalityNumber = personalityNumber;
    }
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
}
