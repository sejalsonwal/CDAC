 import java.util.Scanner; 
 
 public class AbsoluteValue1 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a number: "); 
        int num = sc.nextInt(); 
        int absValue = (num < 0) ? -num : num;    
        System.out.println("Absolute value: " + absValue); 
     sc.close(); 
 } 
}