package com.streams.java.VideoGame;


import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Builder
@Data
@ToString
public class Videogame {
    private String name;
    private Double price;
    private Console console;
    private List<Review> reviews;
    private String officialWebsite;
    private Boolean isDiscount;
    private Integer totalSold;



}
