package com.novice.dev.pushnotification.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Data;


@Data
public class User {

    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "USER_NAME")
    private String username;

    @Column(name = "EMAIL_ADDRESS")
    private String emailAddress;

    @Column(name = "PROFILE_IMAGE")
    private String profileImage;

 }
