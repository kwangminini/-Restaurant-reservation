//package kr.co.restaurant.eatgo.domain;
//
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//@Component
//public class RestaurantRepositoryImpl implements RestaurantRepository {
//    List<Restaurant> restaurants = new ArrayList<>();
//    public RestaurantRepositoryImpl() {
//        restaurants.add(new Restaurant(2020L,"Cyber Food", "Seoul"));
//        restaurants.add(new Restaurant(1004L,"Bob zip", "Seoul"));
//    }
//    @Override
//    public List<Restaurant> findAll(){
//        return restaurants;
//    }
//    @Override
//    public Optional<Restaurant> findById(Long id){
//        return restaurants.stream().filter(r->r.getId().equals(id)).findFirst().orElse(null);
//    }
//
//    @Override
//    public Restaurant save(Restaurant restaurant) {
//        restaurant.setId(1234L);
//        restaurants.add(restaurant);
//        return restaurant;
//    }
//}
