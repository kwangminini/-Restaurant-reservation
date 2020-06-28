package kr.co.restaurant.eatgo.interfaces;

import com.sun.glass.ui.Menu;
import kr.co.restaurant.eatgo.application.RestaurantService;
import kr.co.restaurant.eatgo.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@CrossOrigin
@RestController
@Component
public class RestaurantController {

    @Autowired
    private RestaurantRepository restaurantRepository;
    @Autowired
    private MenuItemRepository menuItemRepository;
    @Autowired
    private RestaurantService restaurantService;

    @GetMapping("/restaurants")
    public List<Restaurant> list(){
        List<Restaurant> restaurants = restaurantService.getRestaurants();
        return restaurants;
    }

    @GetMapping("/restaurants/{id}")
    public Restaurant detail(@PathVariable("id") Long id){
        Restaurant restaurant = restaurantService.getRestaurant(id); //기본정보 + 메뉴정보
        //Restaurant restaurant = restaurantRepository.findById(id);

//        List<MenuItem> menuItems = menuItemRepository.findAllByRestaurantId(id);
//        restaurant.setMenuItems(menuItems);
        return restaurant;
    }
    @PostMapping("/restaurants")
    public ResponseEntity<?> create(@RequestBody Restaurant resource) throws URISyntaxException {
        String name = resource.getName();
        String address= resource.getAddress();
        Restaurant restaurant = Restaurant.builder().name(name).address(address).build();
        restaurantService.addRestaurant(restaurant);
        URI location = new URI("/restaurants/"+restaurant.getId());
        return ResponseEntity.created(location).body("{}");
    }
    @PatchMapping("/restaurants/{id}")
    public String update(@PathVariable("id") Long id,
                         @RequestBody Restaurant resource){
        String name = resource.getName();
        String address = resource.getAddress();
        restaurantService.updateRestaurant(id,name,address);
        return "{}";
    }
}
