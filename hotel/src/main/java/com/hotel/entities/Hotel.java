package com.hotel.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "hotel")
public class Hotel implements Serializable {
    @Id
    @Column(name = "hotelId")
    private String hotelId;
    @Column(name = "hotelName")
    private String hotelName;
    @Column(name = "hotelAddress")
    private String hotelAddress;
    @Column(name = "hotelnumber")
    private String hotelnumber;
}
