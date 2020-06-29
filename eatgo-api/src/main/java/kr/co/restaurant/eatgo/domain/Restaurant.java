package kr.co.restaurant.eatgo.domain;

import ch.qos.logback.core.BasicStatusManager;
import lombok.*;
import org.hibernate.annotations.NotFound;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;
@Entity
@Getter
@Setter
@NoArgsConstructor // 기본 생성
@Builder
@AllArgsConstructor
public class Restaurant {
    @NotEmpty
    private  String name;
    @NotEmpty
    private  String address;
    @Id
    @GeneratedValue
    private  Long id;
    @Transient //db에저장하지 않겠다는 의미
    private List<MenuItem> menuItems;


    public Restaurant(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public Restaurant(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getInformation(){
        return name + " in " +address;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = new ArrayList<>(menuItems);
    }

    public void updateInformation(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
