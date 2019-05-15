package com.capgemini.foodApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.foodApp.restaurant.RestaurantInfo;
import com.capgemini.foodApp.service.RestaurantService;

@RestController

@CrossOrigin("*")
public class RestaurantController {

	@Autowired
	private RestaurantService service;

	@PostMapping("/signup")
	public ResponseEntity<RestaurantInfo> signupDetailsofRestaurant(@RequestBody RestaurantInfo restaurant) {
		System.out.println(restaurant);
		
		RestaurantInfo r = service.addDetails(restaurant);
		System.out.println(r);

		return new ResponseEntity<RestaurantInfo>(r, HttpStatus.CREATED);

	}
	
	@GetMapping("/loginuser/{email}/{password}")
	public ResponseEntity<RestaurantInfo> logInDetailsForRestaurant(@PathVariable String email, @PathVariable String password)
			throws NullPointerException {
		System.out.println(email);
		System.out.println(password);

		RestaurantInfo restaurant = service.findByEmail(email);

		if(restaurant==null) {
			return new ResponseEntity<RestaurantInfo>(HttpStatus.UNAUTHORIZED);
		}

		if ((restaurant.getEmail().equals(email) && (restaurant.getPassword().equals(password)))) {

			return new ResponseEntity<RestaurantInfo>(restaurant, HttpStatus.ACCEPTED);
		}

		return new ResponseEntity<RestaurantInfo>(HttpStatus.NOT_FOUND);

	}
	
	

	}
	

