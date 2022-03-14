package week6.java;

import java.util.Scanner;

public class Program16 {
    public static void main(String[] args) {
        binary();
    }

    public static void binary (){
        int x, y;
        System.out.print(" Please enter the first binary number ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt(2);
        System.out.print("Please enter the second binary number ");
        y = sc.nextInt(2);
        System.out.println("Sum of two binary numbers: " + Integer.toBinaryString(x + y));

    }
}
