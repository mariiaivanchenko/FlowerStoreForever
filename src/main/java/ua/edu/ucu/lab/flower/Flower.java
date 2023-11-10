package ua.edu.ucu.lab.flower;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Flower {
    @Id
    private int id;
    private double sepalLength;
    private double price;
    private FlowerColor color;
    private FlowerType flowerType;

    public Flower(Flower fl) { 
        this.sepalLength = fl.sepalLength;
        this.flowerType = fl.flowerType;
        this.color = fl.color;
        this.price = fl.price;
    }

}
