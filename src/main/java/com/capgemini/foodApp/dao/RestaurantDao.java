package com.capgemini.foodApp.dao;

import org.springframework.boot.autoconfigure.mongo.MongoClientSettingsBuilderCustomizer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.foodApp.restaurant.RestaurantInfo;

@Repository
public interface RestaurantDao extends MongoRepository<RestaurantInfo, Long> {

	RestaurantInfo findByEmail(String email);
	

}
