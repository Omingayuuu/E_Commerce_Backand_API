package com.pxp.SQLite.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pxp.SQLite.demo.entity.Reviews;

@Repository
public interface ReviewsRepository extends JpaRepository<Reviews, Integer>{
	@Query(nativeQuery = true, value = "select * from Reviews where id_users = ?1")
	public List<Reviews> findByIdOrder(Integer id);
}
