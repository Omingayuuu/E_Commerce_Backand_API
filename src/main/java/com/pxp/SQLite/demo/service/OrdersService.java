package com.pxp.SQLite.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pxp.SQLite.demo.entity.Orders;
import com.pxp.SQLite.demo.entity.Products;
import com.pxp.SQLite.demo.repository.OrdersRepository;

@Service
public class OrdersService {

	@Autowired
	private OrdersRepository orderRepository;
	
	public List<Orders> getOrdersByIdUser(Integer id) {
		 return orderRepository.findByIdUsers(id);
	 }
	
	public Orders getOrdersById(Integer id) {
		 return orderRepository.findById(id).get();
	 }
	
	@Transactional
    public Orders createOrders(Orders orders){
       try {
       	return orderRepository.save(orders);
       } catch (Exception e){
           throw e;
       }
    }
}
