package com.rating.repositry;

import com.rating.enties.Ratings;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Repo extends JpaRepository<Ratings,String> {
    //create here custome methods to find the data

    List<Ratings> findByUserId(String userId);
    List<Ratings> findByHotelId(String hotelId);


}
