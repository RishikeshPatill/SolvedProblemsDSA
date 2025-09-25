package striverDsaSheet;
import java.util.Scanner;
public class Q24KadaneAlgorithm {
	public int longestSubArraySumBruteForce(int []arr) {
		int maxSum=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=i;j<arr.length;j++) {
				sum=sum+arr[j];
				if(sum>maxSum) {
					maxSum=sum;
				}
			}
		}
		return maxSum;
	}
	public int longestSubArraySumKadaneAlgorithm(int []arr) {
		int maxSum=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			if(maxSum<sum) {
				maxSum=sum;
			}
			if(sum<0) {
				sum=0;
			}
		}
		return maxSum;
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
      	Q24KadaneAlgorithm q24=new Q24KadaneAlgorithm();
      	int maxSum=q24.longestSubArraySumKadaneAlgorithm(arr);
      	System.out.println("the maxsum of the longest sub array is:"+maxSum);
		sc.close();
	}
}
