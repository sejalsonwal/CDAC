import java.util.Scanner; 
 
public class CountSet { 
    public static int countOnes(int n) { 
        int count = 0; 
        while (n > 0) { 
            n = n & (n - 1);  
            count++; 
        } 
        return count; 
    } 
 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a number: "); 
        int num = sc.nextInt(); 
        
 
        int onesCount = countOnes(num); 
        System.out.println("Number of 1s in binary: " + onesCount); 
     sc.close(); 
 } 
} 
