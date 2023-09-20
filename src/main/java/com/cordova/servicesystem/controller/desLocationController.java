package com.cordova.servicesystem.controller;

import com.cordova.servicesystem.model.desLocation;
import com.cordova.servicesystem.model.service;
import com.cordova.servicesystem.service.desLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api/desLocation")
public class desLocationController {

    @Autowired
    private final desLocationService driverService;

    public desLocationController(desLocationService driverService) {
        this.driverService = driverService;
    }


    @PostMapping("/save")
    public ResponseEntity<desLocation> saveDriver(@RequestBody desLocation desLocation){
        desLocation saveDriver = driverService.save(desLocation);
        return ResponseEntity.ok(saveDriver);
    }
    @DeleteMapping("/delete")
    public ResponseEntity<Void> deleteUser(@PathVariable Integer id){
        driverService.delete(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/find-all-driver")
    public ResponseEntity<List<desLocation>> findAll(){
        List<desLocation> allDriver = driverService.findAllUserList();
        return  ResponseEntity.ok(allDriver);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Optional<desLocation>> findId(@PathVariable int id){
        Optional<desLocation> driverById = driverService.findUsersById(id);
        return  ResponseEntity.ok(driverById);
    }
}
