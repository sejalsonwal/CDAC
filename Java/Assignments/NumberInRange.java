import java.util.Scanner; 
 
public class NumberInRange { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
 
        System.out.print("Enter a number: "); 
        int number = sc.nextInt(); 
        System.out.println("Is the number in the range 20 to 50? " + (number >= 20 && number <= 50)); 
        sc.close(); 
    } 
}