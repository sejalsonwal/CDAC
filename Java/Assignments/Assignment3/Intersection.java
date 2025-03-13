import java.util.HashSet; 
 
public class Intersection { 
    public static void main(String[] args) { 
        int[] arr1 = {1, 2, 3, 4, 5}; 
        int[] arr2 = {3, 4, 5, 6, 7}; 
 
        System.out.println("Union of arrays:"); 
        printUnion(arr1, arr2); 
 
        System.out.println("\nIntersection of arrays:"); 
        printIntersection(arr1, arr2); 
    } 
 
    static void printUnion(int[] arr1, int[] arr2) { 
        HashSet<Integer> unionSet = new HashSet<>(); 
        for (int num : arr1) { 
            unionSet.add(num); 
        } 
        for (int num : arr2) { 
            unionSet.add(num); 
        } 
        System.out.println(unionSet); 
    } 
 
    static void printIntersection(int[] arr1, int[] arr2) { 
        HashSet<Integer> set1 = new HashSet<>(); 
        HashSet<Integer> intersectionSet = new HashSet<>(); 
 
        for (int num : arr1) { 
            set1.add(num); 
        } 
 
        for (int num : arr2) { 
            if (set1.contains(num)) { 
                intersectionSet.add(num); 
            } 
        } 
        System.out.println(intersectionSet); 
    } 
} 