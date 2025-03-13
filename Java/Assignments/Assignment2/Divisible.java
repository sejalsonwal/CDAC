import java.util.Scanner; 
 
public class Divisible { 

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a number: "); 
        int num = sc.nextInt(); 
        
 
        if (num < 0) num = -num;  
        int sum = 0; 
  
        while (num > 0) { 
            sum += (num & 7);  
            num = num >> 3;    
        } 
        if (sum == 0 || sum == 3 || sum == 6 || sum == 9) { 
            System.out.println("The number is divisible by 3."); 
        } else { 
            System.out.println("The number is NOT divisible by 3."); 
        } 
    sc.close(); 
    } 
} 