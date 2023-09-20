package com.cordova.servicesystem.repository;

import com.cordova.servicesystem.model.traveller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface travellerRepository extends JpaRepository<traveller, Integer> {
}
