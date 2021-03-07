import java.util.*;

public class QuickSort {
	private static void quickSort(int[] arr) {
    	quickSort(arr, 0, arr.length-1);
    }
    private static void quickSort(int[] arr, int start, int end) {
    	if(arr.length == 1) return;
    	int partition = part(arr,start,end);
    	if(start < partition)
    		quickSort(arr,partition,end);
    	if(partition < end)
    		quickSort(arr,0,partition-1);
    }
    private static int part(int[] arr, int start, int end) {
    	int pivot = arr[(start + end)/2];
    	while(start <= end) {
    		while(arr[start] < pivot) start++;
    		while(arr[end] > pivot) end--;
    		if(start <= end) {
    			swap(arr,start,end);
    			start++;
    			end--;
    		}
    	}
    	return start;
    }
    private static void swap(int[] arr, int i, int j) {
    	int temp = arr[i];
    	arr[i] = arr[j];
    	arr[j] = temp;
    }
    public static void print(int[] arr) {
    	for(int i:arr) {
    		System.out.print(i + ", ");
    	}
    
    	System.out.println();
    }

    public static void main(String[] args) {
    	int[] input = {3,9,4,7,5,0,1,6,8,2};
    	print(input);
    	
    	quickSort(input);
    	print(input);
    }
}
