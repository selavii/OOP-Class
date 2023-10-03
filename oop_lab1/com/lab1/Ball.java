package com.lab1;

public class Ball {
    private double radius;
    private String color;

    public Ball(double r, String c) {
        radius = r;
        color = c;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double r) {
        radius = r;
    }

    public void setColor(String c) {
        color = c;
    }

    public void display() {
        System.out.println("Ball Information:");
        System.out.println("Radius: " + radius);
        System.out.println("Color: " + color);
    }

    public static void main(String[] args) {
        Ball myBall = new Ball(5.0, "Red");
        myBall.display();
        myBall.setRadius(6.0);
        myBall.setColor("Blue");
        myBall.display();
    }
}
