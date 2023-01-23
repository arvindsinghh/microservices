package com.rating.controller;

import com.rating.enties.Ratings;
import com.rating.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingController {

    @Autowired
    RatingService ratingService;
    @PostMapping
    ResponseEntity<Ratings> createRating(@RequestBody Ratings ratings){
      Ratings ratings1=ratingService.createRating(ratings);
        return ResponseEntity.status(HttpStatus.OK).body(ratings1);
    }
    @GetMapping("/{ratingId}")
    ResponseEntity<Ratings> getRatingById(@PathVariable String ratingId){
        Ratings ratings=ratingService.getRatingById(ratingId);
        return ResponseEntity.status(HttpStatus.OK).body(ratings);
    }
    @GetMapping
    ResponseEntity<List<Ratings>> getAllRating(){
      List<Ratings>  ratings=ratingService.getAllRatings();
        return ResponseEntity.status(HttpStatus.OK).body(ratings);
    }
    @GetMapping("/user/{userId}")
    ResponseEntity<List<Ratings>> getRatingByUserId(@PathVariable String userId){
       List<Ratings> list = ratingService.getRatingBYUserId(userId);
        return ResponseEntity.status(HttpStatus.OK).body(list);
    }

    @GetMapping("/hotel/{hotelId}")
    ResponseEntity<List<Ratings>> getRatingByhotelId(@PathVariable String hotelId){
        List<Ratings> list = ratingService.getRatingByHotelId(hotelId);
        return ResponseEntity.status(HttpStatus.OK).body(list);
    }

    @DeleteMapping("/{ratingId}")
    void deleteRatingById(Ratings ratingId){
        ratingService.deleteRatingById(ratingId);
    }


}
