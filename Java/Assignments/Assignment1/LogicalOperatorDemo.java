import java.util.Scanner; 
 
public class LogicalOperatorDemo { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
 
        System.out.print("Enter a number: "); 
        int num = scanner.nextInt(); 
 
       
        boolean isPositive = num > 0; 
        boolean isEven = num % 2 == 0; 
 
        if (isPositive && isEven) { 
            System.out.println(num + " is positive and even."); 
        } else if (!isPositive) { 
            System.out.println(num + " is negative or zero."); 
        } else { 
            System.out.println(num + " is positive but odd."); 
        } 
 
        scanner.close(); 
    } 
}