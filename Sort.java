
public class Sort {
	
	// the complexity is O(N^2)
	 public static void bubbleSort(int[] list) {  
	     int temp = 0;  
	     
	     for(int i = 0; i < list.length; i++){  
	    	 // array is traversed from first element to last element
	    	 for(int j = 1; j < list.length - i; j++){  
	    		 // if previous element > current element
	    		 if(list[j-1] > list[j]){  
	    			 //swap elements  
	                 temp = list[j-1];  
	                 list[j-1] = list[j];  
	                 list[j] = temp;  
	             }                
	    	 }  
	     }  
	 }  
	
	// the complexity is O(N^2)
	public static void insertionSort(int[] list){
	   int i, key, j;
	   for (i = 1; i < list.length; i++){
	       key = list[i];
	       j = i-1;
	       
	       //if current element is greater than next element, it continues to swap two elements
	       while (j >= 0 && list[j] > key){
	           list[j+1] = list[j];
	           j = j-1;
	       }
	       list[j+1] = key;
	   }
	}
}
