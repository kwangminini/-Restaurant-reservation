package kr.co.restaurant.eatgo.domain;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Component
public class RestaurantRepositoryImpl implements RestaurantRepository {
    List<Restaurant> restaurants = new ArrayList<>();
    public RestaurantRepositoryImpl() {
        restaurants.add(new Restaurant(2020L,"Cyber Food", "Seoul"));
        restaurants.add(new Restaurant(1004L,"Bob zip", "Seoul"));
    }
    @Override
    public List<Restaurant> findAll(){
        return restaurants;
    }
    @Override
    public Restaurant findById(Long id){
        return restaurants.stream().filter(r->r.getId().equals(id)).findFirst().orElse(null);
    }
}
