package com.hotelapp.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hotelapp.model.Hotel;

@Service
public class HotelDAOImpl implements HotelDAO{

	@Override
	public List<Hotel> getAllHotels() {
		return showHotelList();
	}

	@Override
	public Hotel getById(int id) {
		for (Hotel hotel : showHotelList()) {
			if(hotel.getHotelId()==id)
				return hotel;
		}
		return null;
	}

	@Override
	public List<Hotel> getByCity(String city) {
		List<Hotel> newHotelList = new ArrayList<>();
		for (Hotel hotel : showHotelList()) {
			if(hotel.getCity().equals(city))
				newHotelList.add(hotel);
		}
		return newHotelList;
		
	}

	@Override
	public List<Hotel> getByCuisine(String cuisine) {
		List<Hotel> newHotelList = new ArrayList<>();
		for (Hotel hotel : showHotelList()) {
			if(hotel.getCuisine().equals(cuisine))
				newHotelList.add(hotel);
		}
		return newHotelList;
		
	}

	private List<Hotel> showHotelList(){
		return Arrays.asList(
				new Hotel("Saviruchi", 11, "Mysuru", "Indian"),
				new Hotel("Classio", 12, "Bengaluru", "Chinese"),
				new Hotel("Paradise", 13, "Mangalore", "Italian"));
	}

}
