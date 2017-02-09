package com.efimchick.pirates;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by theje on 2017-02-07.
 */
@Component
public class Sabre {


    private String material;

    private double weight;

    @Autowired
    public Sabre(@Value("steel")String material, @Value("0.8")double weight) {
        this.material = material;
        this.weight = weight;
    }

    public String getMaterial() {
        return material;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Sabre{" +
                "material='" + material + '\'' +
                ", weight=" + weight +
                '}';
    }
}
