package com.university.lab.junitlab03;

public class Calculator1 {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return a / b;
    }

    public double power(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        double result = 1;
        int absExp = Math.abs(exp);
        for (int i = 0; i < absExp; i++) {
            result *= base;
        }
        return exp < 0 ? 1.0 / result : result;
    }

    public int modulus(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return a % b;
    }
}