package com.hotel.repository;

import com.hotel.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Hotelrepo extends JpaRepository<Hotel,String> {
}
