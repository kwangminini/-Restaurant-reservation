package kr.co.restaurant.eatgo.domain;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Component
public class RestaurantRepository {
    List<Restaurant> restaurants = new ArrayList<>();
    public RestaurantRepository() {
        restaurants.add(new Restaurant(2020L,"Cyber Food", "Seoul"));
        restaurants.add(new Restaurant(1004L,"Bob zip", "Seoul"));
    }
    public List<Restaurant> findAll(){
        return restaurants;
    }
    public Restaurant findById(Long id){
        return restaurants.stream().filter(r->r.getId().equals(id)).findFirst().orElse(null);
    }
}
