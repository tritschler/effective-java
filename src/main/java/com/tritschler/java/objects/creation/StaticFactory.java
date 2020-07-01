package com.tritschler.java.objects.creation;

import java.math.BigInteger;

import static java.math.BigInteger.ONE;

/**
 * Item 1 : consider using static factory methods (instead of constructors)
 * Abstract:
 *
 *
 * Adavntages
 *  1. have a name compared to
 *  2.
 *  3.
 *  4.
 *
 */

public class StaticFactory {}


class Car {

    private static Car INSTANCE = new Car();

    // common static method names : from, of, valueOf, getInstance

    // from : a type conversion taking a single parameter and returning this type
    public static Car from(String carType) {

        return new Car();
    }

    // of : an aggregation method
    public static Car of() {
        return new Car();
    }

    // valueOf : a more verbose
    BigInteger maxInt = BigInteger.valueOf(Integer.MAX_VALUE);

    // getInstance
    public static Car getInstance() {
        return INSTANCE;
    }

}
