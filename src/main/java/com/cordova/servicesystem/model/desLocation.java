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
public class desLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int desId;
    private   String serviceId;
    private  String  desComId;
    private  String location;


}
