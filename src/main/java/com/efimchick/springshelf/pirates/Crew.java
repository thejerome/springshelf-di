package com.efimchick.springshelf.pirates;

import java.util.List;
import java.util.Map;

/**
 * Created by EE on 2017-02-09.
 */
public class Crew {

    private Map<String, Pirate> pirates;
    private List<Sabre> oddSabres;


    public Map<String, Pirate> getPirates() {
        return pirates;
    }

    public void setPirates(Map<String, Pirate> pirates) {
        this.pirates = pirates;
    }

    public List<Sabre> getOddSabres() {
        return oddSabres;
    }

    public void setOddSabres(List<Sabre> oddSabres) {
        this.oddSabres = oddSabres;
    }

    @Override
    public String toString() {
        return "Crew{" +
                "pirates=" + pirates +
                ", oddSabres=" + oddSabres +
                '}';
    }
}
