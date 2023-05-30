package com.pxp.SQLite.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pxp.SQLite.demo.entity.Products;
import com.pxp.SQLite.demo.entity.Reviews;
import com.pxp.SQLite.demo.repository.ReviewsRepository;

@Service
public class ReviewsService {

	@Autowired
	private ReviewsRepository reviewsRepository;
	
	public List<Reviews> getReviewsByIdOrder(Integer id) {
		 return reviewsRepository.findByIdOrder(id);
	 }
	
	public Reviews getReviewsById(Integer id) {
		 return reviewsRepository.findById(id).get();
	 }
	
	@Transactional
    public Reviews createReviews(Reviews reviews){
		System.out.print(reviews);

       try {
       	return reviewsRepository.save(reviews);
       } catch (Exception e){
           throw e;
       }
    }
}
