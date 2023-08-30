package com.example.demousermanagement.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name = "t_user")
@Data
public class User {
    @Id
    @GeneratedValue
    private Integer id;

    private String username;

    private String nickname;

    private String password;
}
