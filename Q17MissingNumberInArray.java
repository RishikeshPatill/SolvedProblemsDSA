package striverDsaSheet;
import java.util.Scanner;

public class Q17MissingNumberInArray {
	public int missingNumberInArray(int []arr,int actualSize) {
		int missingNumber=0;
		int n=actualSize;
		int sum=n*(n+1)/2;
		int sumOfArray=0;
		for(int i=0;i<arr.length;i++) {
			sumOfArray+=arr[i];
		}
		missingNumber=sum-sumOfArray;
		return missingNumber;
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
      	Q17MissingNumberInArray q17=new Q17MissingNumberInArray();
      	int missing=q17.missingNumberInArray(arr,arr.length+1);
      	if(missing==0) {
      		System.out.println("the array does not have any missing number:");
      	}else {
      		System.out.println("the the missing the number in the given array is:"+missing);
      	}
		sc.close();
	}
}
