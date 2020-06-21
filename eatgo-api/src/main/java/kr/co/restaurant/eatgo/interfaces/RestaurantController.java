package kr.co.restaurant.eatgo.interfaces;

import kr.co.restaurant.eatgo.domain.Restaurant;
import kr.co.restaurant.eatgo.domain.RestaurantRepository;
import kr.co.restaurant.eatgo.domain.RestaurantRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Component
public class RestaurantController {

    @Autowired
    private RestaurantRepository restaurantRepository;
    @GetMapping("/restaurants")
    public List<Restaurant> list(){
        List<Restaurant> restaurants = restaurantRepository.findAll();
        return restaurants;
    }

    @GetMapping("/restaurants/{id}")
    public Restaurant detail(@PathVariable("id") Long id){
        Restaurant restaurant = restaurantRepository.findById(id);
        return restaurant;
    }
}
