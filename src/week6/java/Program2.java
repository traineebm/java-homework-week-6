package week6.java;
/**
 * Write a java program using the following steps:
 * Declare two static variables
 * Declare one static method
 * Call both static variables into the static method inside the print statement
 * Declare the Main method
 * Call the above static method into the Main method and run the programme
 */
//Declaring two static variables
public class Program2 {
    static String name = "Bindi";
    static String surname = "Maniar";

    //Declaring one static method
    public static void setFullName(){
        System.out.println(name);
        System.out.println(surname);
    }
    //Declaring main method
    public static void main(String[] args) {
        System.out.println(name);
        System.out.println(surname);
        setFullName();
    }
}

