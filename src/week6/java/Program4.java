package week6.java;
/**Write a Java program using the following steps:
 * Declare two instance and two static variables
 * Declare one instance method
 * Declare one static method
 * Call all four instance and static variables into both instance and static methods inside the print statement
 * Declare the Main method
 * Call both instance and static methods into the Main method and run the programme
 */
//Declaring 2 instance and 2 static variables
public class Program4 {
    int a = 36;
    int b = 22;
    static int c = 40;
    static int d = 50;

 //Declaring one instance method
 public void samTest(){
     System.out.println(a);
     System.out.println(b);
     System.out.println(Program4.c);
     System.out.println(Program4.d);
 }

//Declaring one static method
 public static void ssTest(){
     Program4 prog4 = new Program4();
     System.out.println(prog4.a);
     System.out.println(prog4.b);
     System.out.println(c);
     System.out.println(d);
 }

//Declaring the Main method
public static void main(String[] args) {
    Program4 prog4 = new Program4();
    prog4.samTest();
    ssTest();
}
}


