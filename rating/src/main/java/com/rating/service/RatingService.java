package com.rating.service;

import com.rating.enties.Ratings;

import java.util.List;

public interface RatingService {

     Ratings createRating(Ratings ratings);

    List<Ratings>  getRatingByHotelId(String hotelId);
    List<Ratings> getRatingBYUserId(String userId);
     List<Ratings> getAllRatings();

     Ratings getRatingById(String  RatingId);

    void deleteRatingById(Ratings ratingId);
}
