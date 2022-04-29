package java_app;

public class App {

    public static void main(String[] args) {
        
        for (int i = 0; i <= 8; i++){
            if ( i==1) { 
                    System.out.println("Got 1");
            }
            else if (i==5) {
                    System.out.println("Got 5");
            }
            else if (i==8) {
                    System.out.println("Got 8");
            }
            else {
                    System.out.printf("Number: %d\n", i);
            }
        }
        
    }
    
}
