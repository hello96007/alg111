package com.example.myapplication;

public class hello implements AreaInterface {
    public static void main(String[] args) {
        System.out.println("hello");
    }

    @Override
    public double area() {
        return 0;
    }
}
