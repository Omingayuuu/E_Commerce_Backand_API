package com.pxp.SQLite.demo.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pxp.SQLite.demo.entity.Addresses;
import com.pxp.SQLite.demo.repository.AddressesRepository;

@Service
public class AddressesService {

	 @Autowired
	 private AddressesRepository addressesRepository;
	 
	 public Addresses getAddressesByIdUser(Integer id) {
		 return addressesRepository.findByUsersId(id);
	 }
	 
	 public Addresses getAddressesById(Integer id) {
		 return addressesRepository.findById(id).get();
	 }
	 
	 @Transactional
     public Addresses createAddresses(Addresses addresses){
        try {
        	return addressesRepository.save(addresses);
        } catch (Exception e){
            throw e;
        }
     }
}
