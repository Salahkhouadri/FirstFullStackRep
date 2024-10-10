package com.cesur.sprinter.models;

import java.time.LocalDateTime;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "usuarios")

public class User {
    // cntrl + shift + alt + flecha abajo / flecha arriba
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="userName", length=8)
    private String userName;
    @Column(name="password", length=8)
    private String password;
    @Column(name="name", length=8)
    private String name;
    @Column(name="birthDate", length=8)
    private String birthDate;

    @Column(name="lastUpdated", length=8)
    private LocalDateTime lastUpdated;
    @Column(name="deletedAt", length=8)
    private LocalDateTime deletedAt;
    @Column(name="ceeatedAt", length=8)
    private LocalDateTime createdAt;

}
