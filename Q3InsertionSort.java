package striverDsaSheet;
import java.util.Arrays;
import java.util.Scanner;

public class Q3InsertionSort {

	public int[] insertionSort(int []arr) {
		
		for(int i=1;i<arr.length;i++) {
			for(int j=i;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		return arr;
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array n:");
		System.out.println("------------------------------");
		int n=sc.nextInt();
		System.out.println("Enter the elements of the array:");
		System.out.println("--------------------------------");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Q3InsertionSort q3=new Q3InsertionSort();
		q3.insertionSort(arr);
		
		sc.close();
	}

	
}
