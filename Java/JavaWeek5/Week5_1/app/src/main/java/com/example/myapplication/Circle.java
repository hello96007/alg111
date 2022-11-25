package com.example.myapplication;

public class Circle implements AreaInterface{
private int r=1;
@Override
public double area()
{
    return PI*r*r;
}
}
