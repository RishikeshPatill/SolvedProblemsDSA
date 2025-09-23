package striverDsaSheet;
import java.util.Arrays;
import java.util.Scanner;
public class Q12LeftRotateArrayByOne {
	
	public void leftRotateArrayByOne(int []arr) {
		int temp=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=temp;
	}
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
     	System.out.println("enter the size of the array:");
     	int num=sc.nextInt();
     	System.out.println("enter the values in the array:");
     	int []arr=new int[num];
     	for(int i=0;i<num;i++) {
     		arr[i]=sc.nextInt();
     	}	 
     	System.out.println("Array Before left rotation by one:");
     	System.out.println(Arrays.toString(arr));
     	Q12LeftRotateArrayByOne q12=new Q12LeftRotateArrayByOne();
     	q12.leftRotateArrayByOne(arr);
     	System.out.println("Array after left rotation by one:");
     	System.out.println(Arrays.toString(arr));
		sc.close();
	}
}
