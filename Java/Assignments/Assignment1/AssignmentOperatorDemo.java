import java.util.Scanner; 
 
public class AssignmentOperatorsDemo { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a number: "); 
        int num = scanner.nextInt(); 
        System.out.print("Enter a value to assign and modify: "); 
        int value = scanner.nextInt(); 
 
        System.out.println("\nInitial Value: " + value); 
         
        value += num;   
        System.out.println("After += (Addition): " + value); 
         
        value -= num;   
        System.out.println("After -= (Subtraction): " + value); 
         
        value *= num;   
        System.out.println("After *= (Multiplication): " + value); 
         
        value /= num;   
        System.out.println("After /= (Division): " + value); 
         
        value %= num;   
        System.out.println("After %= (Modulus): " + value); 
 
        scanner.close(); 
    } 
}