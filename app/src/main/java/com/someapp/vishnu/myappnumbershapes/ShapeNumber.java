package com.someapp.vishnu.myappnumbershapes;

public class ShapeNumber {

    int number;

    public void setNumber(int num) { number = num; } // Setter method
    public int getNumber() { return number; } // Getter method

    public boolean isTriangular() {

        return false;

    }

    public boolean isSquare() {

        double squareRoot = Math.sqrt(number);
        int checker = (int) squareRoot;
        if(Math.pow(checker, 2) == Math.pow(squareRoot, 2)) { // The int is promoted to a double
            return true;
        } else {

            return false;

        }

    }

}
