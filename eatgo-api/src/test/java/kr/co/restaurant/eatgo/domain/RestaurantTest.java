package kr.co.restaurant.eatgo.domain;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

//@RunWith(SpringRunner.class)
@SpringBootTest
public class RestaurantTest {
    @Test
    public void creation(){
        //Restaurant restaurant = new Restaurant(1004L,"Bob zip","");
        Restaurant restaurant = Restaurant.builder()
                                        .id(1004L)
                                        .name("Bob zip")
                                        .address("Seoul")
                                        .build();
        assertThat(restaurant.getName(), is("Bob zip"));
        assertThat(restaurant.getId(), is(1004L));

    }
    @Test
    public void information(){
        Restaurant restaurant = new Restaurant(1004L,"Bob zip", "Seoul");
        assertThat(restaurant.getAddress(), is("Seoul"));
        assertThat(restaurant.getInformation(), is("Bob zip in Seoul"));
    }
}