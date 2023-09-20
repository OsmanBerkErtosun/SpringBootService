//package com.cordova.servicesystem.controller;
//
//import com.cordova.servicesystem.model.service; // Model sınıfının doğru şekilde import edildiğinden emin olun
//import com.cordova.servicesystem.service.DriverService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@CrossOrigin
//@RestController
//@RequestMapping("/api/driver")
//public class driverController {
//
//    private final DriverService driverService;
//
//    @Autowired
//    public driverController(DriverService driverService) {
//        this.driverService = driverService;
//    }
//
//    @PostMapping(value = "/save", consumes = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<service> saveDriver(@RequestBody service service) {
//        service savedDriver = driverService.save(service);
//        return ResponseEntity.ok(savedDriver);
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity<Void> deleteUser(@PathVariable Integer id) {
//        driverService.delete(id);
//        return ResponseEntity.ok().build();
//    }
//
//    @GetMapping("/find-all-driver")
//    public ResponseEntity<List<service>> findAll() {
//        List<service> allDriver = driverService.findAllUsersList();
//        return ResponseEntity.ok(allDriver);
//    }
//
//    @GetMapping("/find/{id}")
//    public ResponseEntity<Optional<service>> findId(@PathVariable int id) {
//        Optional<service> driverById = driverService.findUsersById(id);
//        return ResponseEntity.ok(driverById);
//    }
//}
//





















package com.cordova.servicesystem.controller;

import com.cordova.servicesystem.dto.driverLogin;
import com.cordova.servicesystem.model.service;
import com.cordova.servicesystem.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@CrossOrigin
@RestController
@RequestMapping("/api/driver")
public class driverController {

    @Autowired
    private final DriverService driverService;

    public driverController(DriverService driverService) {
        this.driverService = driverService;
    }

    @PostMapping(value = "/save")
    public ResponseEntity<service> saveDriver(@RequestBody service service){
           service saveDriver = driverService.save(service);
           return ResponseEntity.ok(saveDriver);
    }
    @DeleteMapping(value = "/delete", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> deleteUser(@PathVariable Integer id){
        driverService.delete(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "/find-all-driver", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<service>> findAll(){
        List<service> allDriver = driverService.findAllUsersList();
        return  ResponseEntity.ok(allDriver);
    }

    @GetMapping(value = "/find/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Optional<service>> findId(@PathVariable int id){
        Optional<service> driverById = driverService.findUsersById(id);
        return  ResponseEntity.ok(driverById);
    }


}
