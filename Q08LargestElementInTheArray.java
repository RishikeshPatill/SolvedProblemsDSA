package striverDsaSheet;
import java.util.Scanner;

public class Q08LargestElementInArray {
	
	public int largestElementInTheArray(int []arr) {
		int largest= Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		return largest;
	}
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("entert the size of the array:");
	int num=sc.nextInt();
	System.out.println("enter the values in the array:");
	int []arr=new int[num];
	for(int i=0;i<num;i++) {
		arr[i]=sc.nextInt();
	}
	Q08LargestElementInArray q8=new Q08LargestElementInArray();
	int largest=q8.largestElementInTheArray(arr);
	System.out.println("largest element of the array:"+largest);
	sc.close();
}
}
