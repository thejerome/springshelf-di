package com.efimchick.springshelf.pirates;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;
import java.math.BigDecimal;

/**
 * Created by EE on 2017-02-15.
 */
public class TreasureValueTaxingMethodReplacer implements MethodReplacer
{
    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
        if (isGetValueMethod(method)){
            return BigDecimal.ZERO;
        } else {
            throw new IllegalArgumentException("wrong method to replace");
        }
    }

    private boolean isGetValueMethod(Method method) {
        if (method.getParameterTypes().length != 0){
            return false;
        }
        if (!("getValue").equals(method.getName())){
            return false;
        }
        if (method.getReturnType() != BigDecimal.class){
            return false;
        }
        return true;
    }
}
