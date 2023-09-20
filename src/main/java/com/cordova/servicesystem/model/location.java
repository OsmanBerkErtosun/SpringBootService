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
public class location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int location_id;
    private String nameSurname;
    private String phone;
    private String location;
    private String studentId;
    private String serviceId;

}
