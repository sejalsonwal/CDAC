import java.util.Scanner; 
 
public class AbsoluteValue { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a number: "); 
        int num = sc.nextInt(); 
        
 
        int mask = num >> 31;   
        int abs = (num + mask) ^ mask; 
 
        System.out.println("Absolute value: " + abs); 
     sc.close(); 
 } 
} 