package com.efimchick.pirates;

import com.efimchick.pirates.Sabre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * Created by theje on 2017-02-07.
 */
@Component("barbossa")
public class Pirate {

    @Value("Barbossa")
    private String name;
    @Value("0")
    private float drunkness;
    @Value("10")
    private BigDecimal cash;
    @Autowired
    private Sabre sabre;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDrunkness() {
        return drunkness;
    }

    public void setDrunkness(float drunkness) {
        this.drunkness = drunkness;
    }

    public BigDecimal getCash() {
        return cash;
    }

    public void setCash(BigDecimal cash) {
        this.cash = cash;
    }

    public Sabre getSabre() {
        return sabre;
    }

    public void setSabre(Sabre sabre) {
        this.sabre = sabre;
    }

    @Override
    public String toString() {
        return "Pirate{" +
                "name='" + name + '\'' +
                ", drunkness=" + drunkness +
                ", cash=" + cash +
                ", sabre=" + sabre +
                '}';
    }
}
