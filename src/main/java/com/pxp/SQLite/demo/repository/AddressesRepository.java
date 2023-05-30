package com.pxp.SQLite.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pxp.SQLite.demo.entity.Addresses;

@Repository
public interface AddressesRepository extends JpaRepository<Addresses, Integer>{
	
//	@Query(nativeQuery = true, value = "select * from Addresses where id_user = ?1")
	public Addresses findByUsersId(Integer id);
}
