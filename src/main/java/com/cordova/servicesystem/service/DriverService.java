package com.cordova.servicesystem.service;

import com.cordova.servicesystem.model.service;
import com.cordova.servicesystem.repository.serviceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DriverService {


    private final serviceRepository repository;


    public DriverService(serviceRepository repository) {
        this.repository = repository;
    }

//    public service findByServicephone(String phone) {
//        return  repository.findByServicephone(phone);
//
//    }

    public List<service> findAllUsersList() {
        return repository.findAll();
    }
    public Optional<service> findUsersById(Integer usersId) {
        return repository.findById(usersId);
    }
    public service save(service service) {
        return repository.save(service);
    }
    public void delete(Integer id){
        repository.deleteById(id);
    }
    public service putAnOrder (List<Integer> bookIdList,String userName){
        return null;
    }
}