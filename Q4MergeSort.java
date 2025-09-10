package striverDsaSheet;
import java.util.Scanner;
import java.util.Arrays;
public class Q4MergeSort {
	
	public void merge(int []arr,int start,int mid,int end){
		
		int []temp=new int[end-start+1];
		int left=start, right=mid+1,index=0;
		
		while(left<=mid && right<=end) {
			if(arr[left]<=arr[right]) {
				temp[index]=arr[left];
				index++;
				left++;
			}else {
				temp[index]=arr[right];
				index++;
				right++;
			}
		}
		//we used this while loop so that array should fill the values 
		//till it is not reached the end okay end is different for both
		while(left<=mid) {
			temp[index]=arr[left];
			index++;
			left++;
		}
		while(right<=end) {
			temp[index]=arr[right];
			index++;
			right++;
		}
		index=0;  //cause we are using the same variable to paste the value as well okay !
		//okay now the next step is to fill the temp values to our array
		while(start<=end) {
			arr[start]=temp[index];
			start++;
			index++;
		}
		
	}
	
	public void mergeSort(int []arr, int start, int end) {
		if(start==end) {
			return ;
		}
		int mid=start+(end-start)/2;
		mergeSort(arr,start,mid);
		mergeSort(arr,mid+1,end);
		merge(arr,start,mid,end);
		
	}

	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array n:");
		System.out.println("------------------------------");
		int n=sc.nextInt();
		System.out.println("enter the values in the array:");
		System.out.println("------------------------------");
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("sorted array after the merge sort:");
		System.out.println("----------------------------------");
		Q4MergeSort q4=new Q4MergeSort();
		int start=0, end=arr.length-1;
		q4.mergeSort(arr,start,end);
		System.out.println(Arrays.toString(arr));
		sc.close();
	}
}
