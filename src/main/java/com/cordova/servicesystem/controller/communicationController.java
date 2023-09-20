package com.cordova.servicesystem.controller;

import com.cordova.servicesystem.model.communication;
import com.cordova.servicesystem.model.desLocation;
import com.cordova.servicesystem.service.communicationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api/communication")
public class communicationController {
    private final communicationService communicationService;

    public communicationController(com.cordova.servicesystem.service.communicationService communicationService) {
        this.communicationService = communicationService;
    }
    @PostMapping("/save")
    public ResponseEntity<communication> saveDriver(@RequestBody communication communication){
        communication saveDriver = communicationService.save(communication);
        return ResponseEntity.ok(saveDriver);
    }
    @DeleteMapping("/delete")
    public ResponseEntity<Void> deleteUser(@PathVariable Integer id){
        communicationService.delete(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/find-all-driver")
    public ResponseEntity<List<communication>> findAll(){
        List<communication> allDriver = communicationService.findAllUserList();
        return  ResponseEntity.ok(allDriver);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Optional<communication>> findId(@PathVariable int id){
        Optional<communication> driverById = communicationService.findUsersById(id);
        return  ResponseEntity.ok(driverById);
    }
}
