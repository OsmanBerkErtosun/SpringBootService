package com.cordova.servicesystem.controller;

import com.cordova.servicesystem.model.location;
import com.cordova.servicesystem.model.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.cordova.servicesystem.service.locationService;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api/location")
public class locationController {

    @Autowired
    private final locationService locationService;

    public locationController(com.cordova.servicesystem.service.locationService locationService) {
        this.locationService = locationService;
    }

    @PostMapping("/save")
    public ResponseEntity<location> saveDriver(@RequestBody location location){
        location saveDriver = locationService.save(location);
        return ResponseEntity.ok(saveDriver);
    }
    @DeleteMapping("/delete")
    public ResponseEntity<Void> deleteUser(@PathVariable Integer id){
        locationService.delete(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/find-all-driver")
    public ResponseEntity<List<location>> findAll(){
        List<location> allDriver = locationService.findAllUserList();
        return  ResponseEntity.ok(allDriver);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Optional<location>> findId(@PathVariable int id){
        Optional<location> driverById = locationService.findUsersById(id);
        return  ResponseEntity.ok(driverById);
    }
}
