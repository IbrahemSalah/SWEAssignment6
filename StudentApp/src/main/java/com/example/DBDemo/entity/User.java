package com.example.DBDemo.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String email;

    private String password;

    private String firstName;

    private String lastName;

    @OneToMany(mappedBy = "user")
    private List<Review> reviews;

    @OneToOne
    @JoinColumn(name = "id_address")
    private Address address;

}
