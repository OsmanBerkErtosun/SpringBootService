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
public class status {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int statusId;
    private String statusName;
    private String date;
    private String studentId;
    private String serviceId;


}
