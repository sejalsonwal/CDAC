  import java.util.Scanner; 
 
  public class SwapBitwiseOp {  
  public static void main(String[] args) { 
  
  Scanner sc = new Scanner(System.in); 
    System.out.print("Enter two numbers: "); 
	
     int x = sc.nextInt(); 
     int y = sc.nextInt(); 
    System.out.println("Before swapping: x = " + x + ", y = " + y); 
	
      x = x ^ y; 
      y = x ^ y; 
      x = x ^ y; 
	  
     System.out.println("After swapping: x = " + x + ", y = " + y); 
     sc.close(); 
   } 
}
		