package com.efimchick.springshelf.pirates;

import java.math.BigDecimal;

/**
 * Created by EE on 2017-02-15.
 */
public abstract class AbstractTreasure {
    public abstract String getName();

    private BigDecimal value;

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
