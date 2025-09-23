package striverDsaSheet;
import java.util.Scanner;
public class Q09SecondLargestAndSmallest {
	
	public int secondLargest(int []arr) {
		if(arr.length<2) {
			return -1;
		}
		int largest=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		int secondLargest=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>secondLargest && arr[i]<largest) {
				secondLargest=arr[i];
			}
		}
		if(secondLargest==Integer.MIN_VALUE) {
			return -1;
		}else {
			return secondLargest;
		}
	}
	public int secondLargestOptimal(int []arr) {
		if(arr.length<2) {
			return -1;
		}
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				secondLargest=largest;
				largest=arr[i];
			}else if(arr[i]<largest && arr[i]>secondLargest) {
				secondLargest=arr[i];
			}
		}
		if(secondLargest==Integer.MIN_VALUE) {
			return -1;
		}else {
			return secondLargest;
		}
	}
	public int secondSmallest(int []arr) {
		if(arr.length<2) {
			return -1;
		}
		int smallest=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		int secondSmallest=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<secondSmallest && arr[i]>smallest) {
				secondSmallest=arr[i];
			}
		}
		if(secondSmallest==Integer.MAX_VALUE) {
			return -1;
		}else {
			return secondSmallest;
		}
	}
	public int secondSmallestOptimal(int []arr) {
		if(arr.length<2) {
			return -1;
		}
		int smallest=Integer.MAX_VALUE;
		int secondSmallest=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<smallest) {
				secondSmallest=smallest;
				smallest=arr[i];
			}else if(arr[i]>smallest && arr[i]<secondSmallest) {
				secondSmallest=arr[i];
			}
		}
		if(secondSmallest==Integer.MAX_VALUE) {
			return -1;
		}else {
			return secondSmallest;
		}
	}
 public static void main(String []args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the size of the array:");
	 int num=sc.nextInt();
	 System.out.println("enter the values of the array:");
	 int []arr=new int[num];
	 for(int i=0;i<num;i++) {
		 arr[i]=sc.nextInt();
	 }
	 Q09SecondLargestAndSmallest q9=new Q09SecondLargestAndSmallest();
	 System.out.println("second largest element of the array is:"+q9.secondLargest(arr));
	 System.out.println("second smallest element of the array is:"+ q9.secondSmallest(arr));
	 System.out.println("second largest element of the array using optimal solution is:"+q9.secondLargestOptimal(arr));
	 System.out.println("second smallest element of the array using optimal solution is:"+ q9.secondSmallestOptimal(arr));
	 sc.close();
 }
}
