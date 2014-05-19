
import java.util.*;

import javax.swing.JOptionPane;

public class InsertionSortDemo {


	public static void main(String[] args) {
		
		int n;
		Random rand = new Random(System.currentTimeMillis());
		String numberOption;
		
		
		numberOption = JOptionPane.showInputDialog("What is the size of the array you wish to generate?");
		n = Integer.parseInt(numberOption);
		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = rand.nextInt(20 * n);
					
			long insertionStart = System.nanoTime();
		
			insertionSort(arr);
			
			long insertionEnd = System.nanoTime();
			long insertionTime = insertionEnd-insertionStart;
			
			long bubbleStart = System.nanoTime();
			
			bubbleSort(arr);
			
			long bubbleEnd = System.nanoTime();
			long bubbleTime = bubbleEnd-bubbleStart;
			
			long selectionStart = System.nanoTime();
			
			selectionSort(arr);
			
			long selectionEnd = System.nanoTime();
			long selectionTime = selectionEnd-selectionStart;
			
			JOptionPane.showMessageDialog(null, "Insertion Sort Lap Time: " + (insertionTime) + " nanoseconds.\n" +
					"Bubble Sort Lap Time: " + (bubbleTime) + " nanoseconds.\n" +
					"Selection Sort Lap Time: " + (selectionTime) + " nanoseconds.");
			
	}//main
	public static void displayArray(int[] numbers){
		for (int i: numbers){
			System.out.print(i);
			System.out.print(", ");
			}
		System.out.println();
	}
	
	 public static void insertionSort(int[] numbers){
		  
		 for(int i=1; i<numbers.length;i++){
			   int temp=numbers[i];
			   int j;
		   for(j=i-1;j>=0 && temp<numbers[j];j--){
			   numbers[j+1]=numbers[j];
		   }
		   numbers[j+1]=temp;
		} // sort the array		
	}//insertionsort
	public static void bubbleSort(int[] numbers){
		 for (int i = 0; i < numbers.length; i++) {
			    for (int x = 1; x < numbers.length - i; x++) {
			        if (numbers[x - 1] > numbers[x]) {
			            int temp = numbers[x - 1];
			            numbers[x - 1] = numbers[x];
			            numbers[x] = temp;
			        }
			    }
		 }	   
		
	}//bubble sort
	public static void selectionSort(int[] numbers) {
	    for (int i=0; i<numbers.length-1; i++) {
	        int minIndex = i;      // Index of smallest remaining value.
	        for (int j=i+1; j<numbers.length; j++) {
	            if (numbers[minIndex] > numbers[j]) {
	                minIndex = j;  // Remember index of new minimum
	            }
	        }
	        if (minIndex != i) { 
	            //...  Exchange current element with smallest remaining.
	            int temp = numbers[i];
	            numbers[i] = numbers[minIndex];
	            numbers[minIndex] = temp;
	        }
	    }
	}//selectionSort	

}//class
