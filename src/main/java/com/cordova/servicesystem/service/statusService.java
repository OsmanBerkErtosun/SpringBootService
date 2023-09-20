package com.cordova.servicesystem.service;

import com.cordova.servicesystem.model.service;
import com.cordova.servicesystem.model.status;
import com.cordova.servicesystem.repository.statusRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class statusService {

    private final statusRepository repository;

    public statusService(statusRepository repository) {
        this.repository = repository;
    }

    public List<status> findAllUsersList() {
        return repository.findAll();
    }
    public Optional<status> findUsersById(Integer usersId) {
        return repository.findById(usersId);
    }
    public status save(status service) {
        return repository.save(service);
    }
    public void delete(Integer id){
        repository.deleteById(id);
    }
}
