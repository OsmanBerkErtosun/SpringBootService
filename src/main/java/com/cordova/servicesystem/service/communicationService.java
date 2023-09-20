package com.cordova.servicesystem.service;

import com.cordova.servicesystem.model.communication;
import com.cordova.servicesystem.model.desLocation;
import com.cordova.servicesystem.repository.communicationRepository;
import com.cordova.servicesystem.repository.desLocationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class communicationService {

    private final communicationRepository communicationRep;

    public communicationService( communicationRepository communicationRep) {
        this.communicationRep = communicationRep;
    }
    public List<communication> findAllUserList(){
        return communicationRep.findAll();
    }
    public Optional<communication> findUsersById(Integer usersId) {return communicationRep.findById(usersId);}
    public communication save(communication communication) {return communicationRep.save(communication);}
    public void delete(Integer id){
        communicationRep.deleteById(id);
    }

}
