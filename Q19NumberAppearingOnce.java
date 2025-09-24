package striverDsaSheet;

import java.util.Scanner;

public class Q19NumberAppearingOnce {
	public int numberAppearingOnceBruteForce(int []arr) {
		int number=-1;
		for(int i=0;i<arr.length;i++) {
			int num=arr[i];
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[j]==num) {
					count++;
				}
			}
			if(count==1) {
				number=num;
			}
		}
		return number;
	}
	public int numberAppearingOnceUsingHashing(int []arr) {
		int number=-1;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		int []hashValue=new int[max+1];
		for(int i=0;i<arr.length;i++) {
			hashValue[arr[i]]+=1;
		}
		for(int i=0;i<arr.length;i++) {
			if(hashValue[arr[i]]==1) {
				number=arr[i];
				return number;
			}
		}
		return number;
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
      	Q19NumberAppearingOnce q19=new Q19NumberAppearingOnce();
//      int result=q19.numberAppearingOnceBruteForce(arr);
      	int result=q19.numberAppearingOnceUsingHashing(arr);
      	if(result==-1) {
      		System.out.println("there is no such number with appearence once");
      	}else {
      		System.out.println("the number appearing once is:"+result);
      	}
		sc.close();
	}
}
