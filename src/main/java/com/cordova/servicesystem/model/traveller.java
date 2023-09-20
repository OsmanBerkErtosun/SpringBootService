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
public class traveller {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int student_id;
    private String name;
    private String surname;
    private String phone;
    private String companyName;
    private String password;
    private String tc;
    private String plate;

}
