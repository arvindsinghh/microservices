package com.rating.enties;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Ratings {
    @Id
    private String rattingId;
    private String userId;
    private int rating;
    private String feedback;
    private String hotelId;
}
