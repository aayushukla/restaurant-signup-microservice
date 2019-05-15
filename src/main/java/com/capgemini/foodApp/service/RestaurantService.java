package com.capgemini.foodApp.service;

import org.springframework.stereotype.Service;

import com.capgemini.foodApp.restaurant.RestaurantInfo;

@Service
public interface RestaurantService {
public RestaurantInfo addDetails(RestaurantInfo restaurant);
public RestaurantInfo findByEmail(String email);
}
