package kr.co.restaurant.eatgo.domain;

import ch.qos.logback.core.BasicStatusManager;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Restaurant {
    private  String name;
    private  String address;
    @Id
    @GeneratedValue
    private  Long id;
    @Transient //db에저장하지 않겠다는 의미
    private List<MenuItem> menuItems = new ArrayList<MenuItem>();

    public Restaurant() {
    }

    public Restaurant(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public Restaurant(String name, String address){
        this.name = name;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String getInformation(){
        return name + " in " +address;
    }

    public String getAddress() {
        return address;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        for(MenuItem menuItem:menuItems){
            addMenuItem(menuItem);
        }
    }

    public void setId(long id) {
        this.id = id;
    }
}
