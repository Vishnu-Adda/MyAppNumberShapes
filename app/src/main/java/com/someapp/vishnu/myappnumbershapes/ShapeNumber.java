package com.someapp.vishnu.myappnumbershapes;

public class ShapeNumber {

    int number;

    // To set the number field
    public ShapeNumber(int num) {

        number = num;

    }

    public void setNumber(int num) { number = num; } // Setter method
    public int getNumber() { return number; } // Getter method

    // Based on the fact that a number is triangular if 8x + 1 is a perfect square
    public boolean isTriangular() {
        double equNum = 8*number+1;
        int squareCheck = (int) Math.sqrt(equNum);
        if (Math.pow(squareCheck, 2) == equNum) {
            return true;
        }
        return false;

    }

    public boolean isSquare() {

        double squareRoot = Math.sqrt(number);
        int checker = (int) squareRoot;
        if(Math.pow(checker, 2) == Math.pow(squareRoot, 2)) { // The int is promoted to a double
            return true;
        }
        return false;

    }

    // For checking and logging
    public String toString() {

        return String.valueOf(number);

    }

}
