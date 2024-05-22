package com.project.orderfastfood.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "id")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "username",nullable = false)
    private String username;
    @Column(name = "password",nullable = false)
    private String password;
    @Column(name = "email")
    private String email;
    @Column(name = "phone")
    private String phone;
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "role_id",nullable = false)
//    private Role role;
    @Column(name = "role_id" ,columnDefinition = "INT")
    @Enumerated(EnumType.ORDINAL)
    private Role role;
    @Column(name = "status_id" ,columnDefinition = "INT")
    @Enumerated(EnumType.ORDINAL)
    private Status status;
}
