package com.cordova.servicesystem.controller;

import com.cordova.servicesystem.model.service;
import com.cordova.servicesystem.model.traveller;
import com.cordova.servicesystem.service.travellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api/traveller")
public class travellerController {

    @Autowired
    private final travellerService service;

    public travellerController(travellerService service) {
        this.service = service;
    }

    @PostMapping("/save")
    public ResponseEntity<traveller> saveDriver(@RequestBody traveller saveTraveller){
        traveller saveDriver = service.save(saveTraveller);
        return ResponseEntity.ok(saveDriver);
    }
    @DeleteMapping("/delete")
    public ResponseEntity<Void> deleteUser(@PathVariable Integer id){
        service.delete(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/find-all-driver")
    public ResponseEntity<List<traveller>> findAll(){
        List<traveller> allDriver = service.findAllDriverList();
        return  ResponseEntity.ok(allDriver);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Optional<traveller>> findId(@PathVariable int id){
        Optional<traveller> driverById = service.findTravellerById(id);
        return  ResponseEntity.ok(driverById);
    }


}
