import java.util.Scanner; 
 
public class SwapNumbers { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Enter first number (a): "); 
        int a = sc.nextInt(); 
         
        System.out.print("Enter second number (b): "); 
        int b = sc.nextInt(); 
         
        a += b;  
        b = a - b;  
        a -= b;  
         
        System.out.println("After swapping:"); 
        System.out.println("First number (a): " + a); 
        System.out.println("Second number (b): " + b); 
    sc.close(); 
 } 
}