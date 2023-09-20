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
public class communication {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int comId;
    private   String nameSurname;
    private  String  email;
    private  String phone;
    private  String type;
    private  String explanation;



}
