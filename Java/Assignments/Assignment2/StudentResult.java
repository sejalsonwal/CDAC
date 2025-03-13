import java.util.Scanner; 
public class StudentResult { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the student's percentage: "); 
        double percentage = sc.nextDouble(); 
 
        String result = (percentage >= 40) ? "Pass" : "Fail"; 
        System.out.println("Result: " + result); 
  sc.close();    
   } 
}