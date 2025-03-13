import java.util.Scanner; 
 
public class IncrementNumber { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a number: "); 
        int num = sc.nextInt(); 
        int incrementedValue = -~num;  
         
        System.out.println("Incremented value: " + incrementedValue); 
     sc.close(); 
 } 
}