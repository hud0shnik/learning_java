package java_app;

public class App {

    public static void main(String[] args) {
        
        int n1=0,n2=1,n3,i;    
        System.out.print("0, 1");   
    
        for(i=2;i<88;++i){    
            n3=n1+n2;    
            System.out.print(", "+n3);    
            n1=n2;    
            n2=n3;    
        }    
        
        System.out.println("\nDone.");
    }
}
