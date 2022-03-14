package week6.java;

/**
 * Write a java program using the following steps:
 * Declare two instance variables
 * Declare one instance method
 * Call both instance variables into the instance method inside the print statement
 * Declare the Main method
 * Call the above instance method into the Main method and run the programme
 */
//Declaring two instance variables
public class Program1 {
    int a = 30;
    int b = 60;

    //Declaring one instance method
    public void integer() {
        System.out.println(a);
        System.out.println(b);
    }

    //Declaring the main method
    public static void main(String[] args) {
        Program1 obj = new Program1();//object
        System.out.println(obj.a);
        System.out.println(obj.b);
        obj.integer();//calling instance method into the main method via object
    }
}


