package com.rating.service;

import com.rating.enties.Ratings;
import com.rating.exceptionhandler.ResourceNotFoundException;
import com.rating.repositry.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RatingServiceimpl implements RatingService{

    @Autowired
    Repo repo;

    @Override
    public Ratings createRating(Ratings ratings) {
       String uid= UUID.randomUUID().toString();
       ratings.setRattingId(uid);
       Ratings ratings1= repo.save(ratings);
        return ratings1;
    }

    @Override
    public List<Ratings> getRatingByHotelId(String hotelId) {
        //for this we need to create custome finding methods in Repostiory
        return repo.findByHotelId(hotelId)  ;
    }

    @Override
    public List<Ratings> getRatingBYUserId(String userId) {
        //for this we need to create custome finding methods in Repostiory
        return repo.findByUserId(userId);
    }

    @Override
    public List<Ratings> getAllRatings() {
        List<Ratings> list=repo.findAll();
        return list;
    }

    @Override
    public Ratings getRatingById(String ratingId) {
       Ratings ratings= repo.findById(ratingId).orElseThrow(()->new ResourceNotFoundException("Not found"));
        return ratings;
    }

    @Override
    public void deleteRatingById(Ratings ratingId) {
        repo.delete(ratingId);
    }
}
