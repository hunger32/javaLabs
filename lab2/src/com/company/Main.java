package com.company;


public class Main {

    public static void main(String[] args) {
        Point p1 = new Point(5,10).translate(5,-40).scale(0.5);
        Point p2 = p1.scale(2);
        System.out.println("x = " + p1.getX() + "\ny = " + p1.getY());
        System.out.println("x = " + p2.getX() + "\ny = " + p2.getY());
        Dot d1 = new Dot(20,30);
        Dot d2 = d1.set(-19, -28, 4);
        System.out.println("x = " + d1.getX() + "\ny = " + d1.getY());
        System.out.println("x = " + d2.getX() + "\ny = " + d2.getY());


    }
}
