package striverDsaSheet;
import java.util.Scanner;
import java.util.Arrays;
public class Q5RecursiveBubbleSort {

	public void recursiveBubbleSort(int []arr, int n) {
		if(n==1) {
			return ;
		}
		for(int i=0;i<n-1;i++) {
			if(arr[i]>arr[i+1]) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		recursiveBubbleSort(arr,n-1);
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array n:");
		System.out.println("--------------------------");
		int n=sc.nextInt();
		System.out.println("enter the value in the array:");
		System.out.println("-----------------------------");
		int []arr=new int[n];
		for (int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Q5RecursiveBubbleSort q5=new Q5RecursiveBubbleSort();
		q5.recursiveBubbleSort(arr,n);
		System.out.println("------------------------------");
		System.out.println(Arrays.toString(arr));
		sc.close();
	}
}
