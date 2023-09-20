package com.cordova.servicesystem.service;

import com.cordova.servicesystem.model.desLocation;
import com.cordova.servicesystem.model.service;
import com.cordova.servicesystem.repository.desLocationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class desLocationService {


    private final desLocationRepository desRepository;

    public desLocationService(desLocationRepository desRepository) {
        this.desRepository = desRepository;
    }
    public List<desLocation> findAllUserList(){
        return desRepository.findAll();
    }
    public Optional<desLocation> findUsersById(Integer usersId) {
        return desRepository.findById(usersId);
    }
    public desLocation save(desLocation desLocation) {
        return desRepository.save(desLocation);
    }
    public void delete(Integer id){
        desRepository.deleteById(id);
    }

}