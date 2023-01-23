package com.hotel.service;

import com.hotel.entities.Hotel;

import java.util.List;

public interface HotelInterFace {
    Hotel createHotel(Hotel hotel);
    Hotel getHotel(String hotelId);
    List<Hotel> getAllHotels();
}
