package java_app;

public class App {

    public static void main(String[] args) {
       
        for (int i = 0; i <= 8; i++){
            switch(i){
                case 0:            
                    System.out.println("Got 0!");
                    break;
                case 2:            
                    System.out.println("Got 2!");
                    break;
                case 4:            
                    System.out.println("Got 4!");
                    break;
                case 8:            
                    System.out.println("Got 8!");
                    break;
                default:            
                    System.out.printf("Number is %d\n", i);
            }
        }
        
        
        
    }
    
}
