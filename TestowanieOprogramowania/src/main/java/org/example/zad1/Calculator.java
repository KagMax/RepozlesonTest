package org.example.zad1;

public class Calculator {
    public double add(double x,double y, double z){

        return x+y+z;

    }
    public double substract(double x, double y) {
        return x - y;
    }

    public double multiply(double x, double y) {
        return x * y;
    }

    public double divide(double x, double y) {
        if (y != 0) {
            return x / y;
        } else {
            throw new ArithmeticException("Nie można dzielić przez zero.");
        }
    }


}

