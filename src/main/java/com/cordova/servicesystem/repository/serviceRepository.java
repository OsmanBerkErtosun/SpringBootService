package com.cordova.servicesystem.repository;

import com.cordova.servicesystem.model.service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface serviceRepository extends JpaRepository<service, Integer> {
//    service findByServicephone(String phone);

}
