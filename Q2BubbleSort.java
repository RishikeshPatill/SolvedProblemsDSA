package striverDsaSheet;

import java.util.Arrays;
import java.util.Scanner;

public class Q2BubbleSort {

	public int[] bubbleSort(int []arr) {
		for(int i=arr.length-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
		System.out.println(Arrays.toString(arr));
		return arr;
	}
	public static void main(String []args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the size of the array n: ");
		int n=sc.nextInt();
		System.out.println("enter the values in the array");
		System.out.println("-----------------------------");
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Q2BubbleSort q2=new Q2BubbleSort();
		q2.bubbleSort(arr);
		sc.close();
		
	}
}
