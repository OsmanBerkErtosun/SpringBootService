package com.cordova.servicesystem.service;

import com.cordova.servicesystem.model.traveller;
import com.cordova.servicesystem.repository.travellerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class travellerService {

    private final travellerRepository repository;

    public travellerService(travellerRepository repository) {
        this.repository = repository;
    }

    public List<traveller> findAllDriverList(){ return repository.findAll();}
    public Optional<traveller> findTravellerById(Integer travellerId){ return repository.findById(travellerId);}
    public traveller save(traveller traveller){return repository.save(traveller);}
    public void delete(Integer id){ repository.deleteById(id);}
}

