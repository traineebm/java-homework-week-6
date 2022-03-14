package week6.java;
/** Write a program for a calculator with addition, subtraction, multiplication, division methods
 all with parameters and use string concatenation methods
 * Notes: Two static and two instance methods
 */

public class Program5 {
    public static void main(String[] args) {
        Program5 s = new Program5();

        addition(20, 30);
        subtraction(100, 60);
        s.multiplication(25, 8);
        s.division(40, 4);

    }



    public static void addition(int a, int b) {
        System.out.println("Addition of a and b = " + (a + b));
    }

    public static void subtraction(int a, int b) {
        System.out.println("Subtraction of a and b = " + (a - b));
    }
        public void multiplication(int a, int b){
            System.out.println("Multiplication of a and b = " + (a * b));
        }
    public void division(int a, int b){
        System.out.println("Division of a and b = " + (a / b));
    }

}