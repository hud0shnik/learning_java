package java_app;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner scanner0 = new Scanner(System.in);
        System.out.printf("Enter string:\t");

        String input_str = scanner0.nextLine();
        System.out.println("Input is: " + input_str);
        
    }
    
}
