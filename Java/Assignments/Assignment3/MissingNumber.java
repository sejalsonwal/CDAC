public class MissingNumber { 
    public static int findMissing(int[] arr, int n) { 
        int totalSum = n * (n + 1) / 2;  
        int arraySum = 0; 
         
        for (int num : arr) { 
            arraySum += num; 
        } 
         
        return totalSum - arraySum;  
    } 
     
    public static void main(String[] args) { 
        int[] arr = {1, 2, 3, 4, 6, 7, 8};  
        int n = 8;  
         
        System.out.println("Missing Number: " + findMissing(arr, n)); 
    } 
} 