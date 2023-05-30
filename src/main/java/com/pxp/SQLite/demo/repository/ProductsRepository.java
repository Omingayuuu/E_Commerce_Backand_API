package com.pxp.SQLite.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pxp.SQLite.demo.entity.Addresses;
import com.pxp.SQLite.demo.entity.Products;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Integer>{

	@Query(nativeQuery = true, value = "select * from Products where id_user = ?1")
	public List<Products> findByIdSellers(Integer id);
}
