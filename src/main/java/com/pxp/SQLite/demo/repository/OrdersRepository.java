package com.pxp.SQLite.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pxp.SQLite.demo.entity.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer>{
	@Query(nativeQuery = true, value = "select * from Orders where id_user = ?1")
	public List<Orders> findByIdUsers(Integer id);
}

