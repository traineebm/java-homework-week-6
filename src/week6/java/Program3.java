package week6.java;
/**
 * Write a java program using the following steps:
 * Declare one instance and one static variable
 * Declare one instance method
 * Declare one static method
 * Call both instance and static variables into both instance and static methods inside the print statement
 * Declare the Main method
 * Call both instance and static methods into the Main method and run the programme
 */
//Declaring one instance variable and one static variable
public class Program3 {
    int a = 69;
    static int b = 96;

    //Declaring one instance method
    public void inMethod() {
        System.out.println(a);
        System.out.println(Program3.b);
    }

    //Declaring one static method
    public static void stMethod() {
        Program3 prog3 = new Program3();
        System.out.println(prog3.a);
        System.out.println(b);
    }

    //Declaring the main method
    public static void main(String[] args) {
        Program3 prog3 = new Program3();
        prog3.inMethod();
        stMethod();
    }
}
