package week6.java;

public class Program14 {
    public static void main(String[] args) {
        final double w = 5.6;
        final double h = 8.5;
        double area = w*h;
        double perimeter = 2*(w + h);
        System.out.printf("Area is %.1f * %.1f = %.2f \n", w, h, perimeter);
        System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", w, h, area);
    }
}
