import java.util.Scanner; 
public class EvenOddBitwiseOp { 

 public static void main(String[] args) { 
 Scanner sc = new Scanner(System.in); 
 
    System.out.print("Enter a number: "); 
    int n= sc.nextInt(); 
	
    if( (n&1)==0) { 
    System.out.print(n+ " is Even: "); 
    } 
	
    else{ 
    System.out.print(n+ " is Odd: "); 
    } 
    sc.close(); 
 } 
} 
 
 
