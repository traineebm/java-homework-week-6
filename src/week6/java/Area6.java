package week6.java;

import java.util.Scanner;

public class Area6 {
    public static void main(String[] args) {
        double radius, area;
        double pi = 3.14;
        Scanner s = new Scanner(System.in);
        System.out.print(" Enter radius of circle: ");
        radius  = s.nextDouble();
        area  = pi * radius * radius;
        System.out.println("Area of circle: " + area);

    }
}
