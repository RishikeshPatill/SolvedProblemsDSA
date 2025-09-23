package striverDsaSheet;
import java.util.Arrays;
import java.util.Scanner;
public class Q06RecursiveInsertionSort {

	public void recursiveInsertionSort(int []arr,int n,int i) {
		if(i==n) {
			return;
		}
		for(int j=i;j>0;j--) {
			if(arr[j]<arr[j-1]) {
				int temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
			}
		}
		recursiveInsertionSort(arr,n,i+1);
	}
	public static void main(String []args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size of the array u want to create n:");
		int num=sc.nextInt();
		System.out.println("enter "+num+" values in the array:");
		int []arr=new int[num];
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		Q06RecursiveInsertionSort q6=new Q06RecursiveInsertionSort();
		q6.recursiveInsertionSort(arr, num, 1);
		System.out.println("Array after recursive insertion sort:");
		System.out.println("-----------------------------------");
		System.out.println(Arrays.toString(arr));
		sc.close();
	}
}
