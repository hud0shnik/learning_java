package java_app;

public class App {

    public static void main(String[] args) {
        
        for (int i = 0; i <= 8; i++){
            if ( i==1) { 
                    System.out.println("Catch 1");
            }
            else if (i==5) {
                    System.out.println("Catch 5");
            }
            else if (i==8) {
                    System.out.println("Catch 8");
            }
            else {
                    System.out.printf("Number: %d\n", i);
            }
        }
        
    }
    
}
