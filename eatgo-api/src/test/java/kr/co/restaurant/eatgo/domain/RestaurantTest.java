package kr.co.restaurant.eatgo.domain;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RestaurantTest {
    @Test
    public void creation(){
        Restaurant restaurant = new Restaurant("Bob zip","");
        assertThat(restaurant.getName(), is("Bob zip"));

    }
    @Test
    public void information(){
        Restaurant restaurant = new Restaurant("Bob zip", "Seoul");
        assertThat(restaurant.getAddress(), is("Seoul"));
        assertThat(restaurant.getInformation(), is("Bob zip in Seoul"));
    }
}