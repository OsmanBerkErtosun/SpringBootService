package com.cordova.servicesystem.controller;

import com.cordova.servicesystem.model.service;
import com.cordova.servicesystem.model.status;
import com.cordova.servicesystem.service.statusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api/status")
public class statusController {
    @Autowired
    private final statusService driverService;

    public statusController(statusService driverService) {
        this.driverService = driverService;
    }


    @PostMapping("/save")
    public ResponseEntity<status> saveDriver(@RequestBody status status){
        status saveDriver = driverService.save(status);
        return ResponseEntity.ok(saveDriver);
    }
    @DeleteMapping("/delete")
    public ResponseEntity<Void> deleteUser(@PathVariable Integer id){
        driverService.delete(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/find-all-driver")
    public ResponseEntity<List<status>> findAll(){
        List<status> allDriver = driverService.findAllUsersList();
        return  ResponseEntity.ok(allDriver);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Optional<status>> findId(@PathVariable int id){
        Optional<status> driverById = driverService.findUsersById(id);
        return  ResponseEntity.ok(driverById);
    }
}
