package striverDsaSheet;
import java.util.Arrays;
import java.util.Scanner;

public class Q1SelectionSort {
	
	Scanner sc= new Scanner(System.in);
	
	public int[] selectionSort() {
		System.out.println("enter the size of the array n:");
		int n=sc.nextInt();
		
		System.out.println("------------------------------");
		System.out.println("enter all the "+n+" array elements below and press enter after each");
		
		int[] arr=new int[n]; 
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		//the selection sort goes from here as from the above loop we have got the array okay so now we can sort it 
		//basically the algorithm is to push the min-m element to the starting index of the array considering the first 
		//element as min-m
		for(int i=0;i<n-1;i++) {
			int mini=i;
			for(int j=i+1;j<n;j++) {
				if(arr[mini]>arr[j]) {
					mini=j;
				}
			}
			//here we do swap
			int temp=arr[i];
			arr[i]=arr[mini];
			arr[mini]=temp;
		}
		System.out.println("All the array elements after selection sort okay !");
		System.out.println("-------------------------------------------");
		System.out.println(Arrays.toString(arr));
		return arr;
	
	}
	
	

	public static void main(String []args) {
		
		Q1SelectionSort q1=new Q1SelectionSort();
		q1.selectionSort();
	}

	
}
