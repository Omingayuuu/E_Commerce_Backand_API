package com.pxp.SQLite.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pxp.SQLite.demo.entity.Addresses;
import com.pxp.SQLite.demo.entity.Orders;
import com.pxp.SQLite.demo.entity.Products;
import com.pxp.SQLite.demo.entity.Reviews;
import com.pxp.SQLite.demo.entity.Users;
import com.pxp.SQLite.demo.service.AddressesService;
import com.pxp.SQLite.demo.service.OrdersService;
import com.pxp.SQLite.demo.service.ProductsService;
import com.pxp.SQLite.demo.service.ReviewsService;
import com.pxp.SQLite.demo.service.UsersService;

@RestController
public class MainController {

	@Autowired
	private UsersService usersService;
	
	@Autowired
	private AddressesService addressesService;
	
	@Autowired
	private ProductsService productsService;
	
	@Autowired
	private ReviewsService reviewsService;
	
	@Autowired
	private OrdersService ordersService;
	
	@RequestMapping(value = "infokan", method = RequestMethod.GET)
    public String infoBang(){
        return "Aplikasi Berjalan...";
    }
	
	@RequestMapping(value = "users", method = RequestMethod.GET)
	public List<Users> getAllUsers() {
		return usersService.getAllUsers();
	}
	
	@GetMapping(value="/users/{id}")
	public Addresses getAddressesByUserId(@PathVariable Integer id) {
		return addressesService.getAddressesByIdUser(id);
	}
	
	@GetMapping(value="/users/{id}/products")
	public List<Products> getProductsByUserId(@PathVariable Integer id) {
		return productsService.getProductsByIdUser(id);
	}
	
	@GetMapping(value="/products/{id}")
	public Products getProductsById(@PathVariable Integer id) {
		return productsService.getProductsById(id);
	}
	
	@GetMapping(value="/products")
	public List<Products> getAllProducts() {
		return productsService.getAllProducts();
	}
	
	@GetMapping(value="/users/{id}/reviews")
	public List<Reviews> getReviewsByIdOrder(@PathVariable Integer id) {
		return reviewsService.getReviewsByIdOrder(id);
	}
	
	@GetMapping(value="/users/{id}/orders")
	public List<Orders> getOrdersByUserId(@PathVariable Integer id) {
		return ordersService.getOrdersByIdUser(id);
	}
	
	
	@GetMapping(value="/orders/{id}")
	public Orders getOrdersById(@PathVariable Integer id) {
		return ordersService.getOrdersById(id);
	}
	
	@RequestMapping(value = "users", method = RequestMethod.POST)
    public ResponseEntity<Users> createUser(@RequestBody Users user){
		try {
        	return new ResponseEntity<Users>(usersService.createUser(user), HttpStatus.OK);
        } catch (Exception e){
            throw e;
        }
    }
	
	@RequestMapping(value = "addresses", method = RequestMethod.POST)
    public ResponseEntity<Addresses> createAddresses(@RequestBody Addresses addresses){
		Users user = usersService.getUserById(addresses.getId_user());
		addresses.setUsers(user);
		try {
        	return new ResponseEntity<Addresses>(addressesService.createAddresses(addresses), HttpStatus.OK);
        } catch (Exception e){
            throw e;
        }
    }
	
	@RequestMapping(value = "products", method = RequestMethod.POST)
    public ResponseEntity<Products> createProducts(@RequestBody Products products){
		Users user = usersService.getUserById(products.getId_user());
		products.setSeller(user);
		try {
        	return new ResponseEntity<Products>(productsService.createProducts(products), HttpStatus.OK);
        } catch (Exception e){
            throw e;
        }
    }
	
	@RequestMapping(value = "orders", method = RequestMethod.POST)
    public ResponseEntity<Orders> createOrders(@RequestBody Orders orders){
		Users user = usersService.getUserById(orders.getId_user());
		orders.setBuyer(user);
		try {
        	return new ResponseEntity<Orders>(ordersService.createOrders(orders), HttpStatus.OK);
        } catch (Exception e){
            throw e;
        }
    }
	
	@RequestMapping(value = "reviews", method = RequestMethod.POST)
    public ResponseEntity<Reviews> createReviews(@RequestBody Reviews reviews){
		Orders order = ordersService.getOrdersById(reviews.getId_users());
		reviews.setOrder(order);
		
		try {
        	return new ResponseEntity<Reviews>(reviewsService.createReviews(reviews), HttpStatus.OK);
        } catch (Exception e){
            throw e;
        }
    }
}

