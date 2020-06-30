package com.tritschler.java.objects.creation;

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

    // from
    public static Car from(String carType) {

        return new Car();
    }

    // of
    public static Car of() {
        return new Car();
    }

    // getInstance
    public static Car getInstance() {
        return INSTANCE;
    }

}
