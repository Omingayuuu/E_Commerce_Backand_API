package com.pxp.SQLite.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pxp.SQLite.demo.entity.Addresses;
import com.pxp.SQLite.demo.entity.Products;
import com.pxp.SQLite.demo.entity.Users;
import com.pxp.SQLite.demo.repository.ProductsRepository;

@Service
public class ProductsService {

	@Autowired
	private ProductsRepository productsRepository;
	
	public List<Products> getProductsByIdUser(Integer id) {
		 return productsRepository.findByIdSellers(id);
	 }
	
	public List<Products> getAllProducts() {
		return productsRepository.findAll();
	}
	 
	 public Products getProductsById(Integer id) {
		 return productsRepository.findById(id).get();
	 }
	 
	 @Transactional
    public Products createProducts(Products product){
       try {
       	return productsRepository.save(product);
       } catch (Exception e){
           throw e;
       }
    }
}
