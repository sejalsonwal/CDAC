import java.util.Scanner; 
 
public class OddEven { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
         
        System.out.print("Enter a number: "); 
        int num = scanner.nextInt(); 
         
        System.out.println((num & 1) == 0 ? "Even" : "Odd"); 
         
        scanner.close(); 
    } 
}