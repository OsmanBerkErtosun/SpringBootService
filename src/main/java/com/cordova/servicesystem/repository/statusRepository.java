package com.cordova.servicesystem.repository;

import com.cordova.servicesystem.model.service;
import com.cordova.servicesystem.model.status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface statusRepository extends JpaRepository<status, Integer> {
}
