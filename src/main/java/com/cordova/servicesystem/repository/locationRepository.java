package com.cordova.servicesystem.repository;

import com.cordova.servicesystem.model.location;
import com.cordova.servicesystem.model.service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface locationRepository extends JpaRepository<location, Integer> {
}
