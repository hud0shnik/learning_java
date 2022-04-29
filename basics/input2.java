package java_app;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner scanner0 = new Scanner(System.in);
        System.out.printf("Enter number or \"q\" to exit:\t");
        
        do {
            
            if(!scanner0.hasNextInt()){
                System.out.println("Wrong input");
                scanner0.next();
                continue;
            }
            
            System.out.printf("\ni * 8 = %d\n", scanner0.nextInt()*8);
        }
        while (!scanner0.hasNext("q"));
   
        
        
        System.out.println("Done.");
        
        
        
    }
    
}
