public class Array3{
	public static void main(String[] args){
		int arr[] = {1,2,3,8,4,5,6,7,0,9};
		FindSecLarg(arr);
	}
	
	public static void FindSecLarg(int[] arr){
		if(arr.length<2){ 
			System.out.println("Only 1 element");
			return;	
		}
		long first = Long.MIN_VALUE, second = Long.MIN_VALUE;	
		for(int i=0; i<arr.length; i++){
			if(arr[i]>first){
				second = first;
				first = arr[i];
			} else if(arr[i]>second){
				second = arr[i];
			}
		}	
		System.out.println("First largest: " + first +  ", Second largest: " + second);		
		
	}
}