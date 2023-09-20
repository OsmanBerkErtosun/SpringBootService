package com.cordova.servicesystem.service;

import com.cordova.servicesystem.model.desLocation;
import com.cordova.servicesystem.model.location;
import com.cordova.servicesystem.repository.locationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class locationService {

    private final locationRepository repository;

    public locationService(locationRepository repository) {
        this.repository = repository;
    }
    public List<location> findAllUserList(){
        return repository.findAll();
    }
    public Optional<location> findUsersById(Integer usersId) {
        return repository.findById(usersId);
    }
    public location save(location location) {
        return repository.save(location);
    }
    public void delete(Integer id){
        repository.deleteById(id);
    }

}

