package com.hotel.service;

import com.hotel.entities.Hotel;
import com.hotel.exceptionhandler.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import com.hotel.repository.Hotelrepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelService implements HotelInterFace {
    @Autowired
    Hotelrepo hotelrepo;
    @Override
    public Hotel createHotel(Hotel hotel) {
       String uuid= UUID.randomUUID().toString();
       hotel.setHotelId(uuid);
        Hotel hotel1=hotelrepo.save(hotel);
        return hotel1;
    }

    @Override
    public Hotel getHotel(String hotelId) {
       Hotel hotel= hotelrepo.findById(hotelId).orElseThrow(()->new ResourceNotFoundException("Not found"));
        return hotel;
    }

    @Override
    public List<Hotel> getAllHotels() {
       List<Hotel> hotel= hotelrepo.findAll();
        return hotel;
    }
}
