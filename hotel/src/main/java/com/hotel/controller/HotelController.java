package com.hotel.controller;

import com.hotel.entities.Hotel;
import com.hotel.payloads.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.hotel.service.HotelService;

import java.util.List;

@RestController
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    HotelService hotelService;
    @PostMapping
    ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
      Hotel hotel1=hotelService.createHotel(hotel);
        return ResponseEntity.status(HttpStatus.OK).body(hotel1);
    }
    @GetMapping("/{hotelId}")
    ResponseEntity<Hotel> getHotel(@PathVariable String hotelId){
        Hotel hotel1=hotelService.getHotel(hotelId);
        return ResponseEntity.status(HttpStatus.OK).body(hotel1);
    }
    @GetMapping
    ResponseEntity<List<Hotel>> getAllHotel(){
       List<Hotel> list = hotelService.getAllHotels();
        return ResponseEntity.status(HttpStatus.OK).body(list);
    }

}
