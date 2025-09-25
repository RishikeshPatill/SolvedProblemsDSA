package striverDsaSheet;
import java.util.Scanner;

public class Q20LongestSubArrayGivenSumK {
	public int longestSubArrayGivenSumKBruteForce(int []arr,int k) {
		int lengthOfSubArray=0;
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=i;j<arr.length;j++) {
				sum=sum+arr[j];
				if(sum==k && lengthOfSubArray<j-i+1) {
					lengthOfSubArray=j-i+1;
				}
			}
		}
		return lengthOfSubArray;
	}
	public int longestSubArrayGivenSumKOptimal(int []arr,int k) {
		int lengthOfSubArray=0;
		int left=0,right=0;
		int sum=arr[0];
		while(right<arr.length) {
			
			while(left<=right && sum>k) {
				sum=sum-arr[left];
				left++;
			}
			if(sum==k && lengthOfSubArray<right-left+1) {
				lengthOfSubArray=right-left+1;
			}
			right++;
			if(right<arr.length) {
				sum=sum+arr[right];
			}
		}
		return lengthOfSubArray;
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
      	System.out.println("enter the value of the sum k:");
      	int k=sc.nextInt();
      	Q20LongestSubArrayGivenSumK q20=new Q20LongestSubArrayGivenSumK();
      	int result=q20.longestSubArrayGivenSumKBruteForce(arr, k);
      	System.out.println("the length of the longest sub array having sum k using bruteforce is:"+result);
      	int length=q20.longestSubArrayGivenSumKOptimal(arr, k);
      	System.out.println("the length of the longest sub array having sum k using optimal is:"+length);
      	sc.close();
	}
}
