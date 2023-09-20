package com.cordova.servicesystem.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class service {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int service_id;
    private String name;
    private String surname;
    private String phone;
    private String email;
    private String password;
    private String tc;
    private String plake;
    private String company;
    private String foto;


}
