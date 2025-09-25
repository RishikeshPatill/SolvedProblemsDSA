package striverDsaSheet;
import java.util.Arrays;
import java.util.Scanner;
public class Q21TwoSumProblem {
	public String twoSumBruteForce(int []arr,int target) {
		String message="we did not got the sum in the array";
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					message="we got the sum in the array";
					return message;
				}
			}
		}
		return message;
	}
	//we can use this optimal approach only if the array is sorted but still these solution is not perfect okay as we are distorting the array, so these are no
	public int[] twoSumOptimal(int []arr,int target) {
		Arrays.sort(arr);
		int []ans=new int[2];
		ans[0]=ans[1]=-1;
		int sum=0,start=0,end=arr.length-1;
		while(start<end) {
			sum=arr[start]+arr[end];
			if(sum==target) {
				ans[0]=start;
				ans[1]=end;
				return ans;
			}else if(sum<target) {
				start++;
			}else {
				end--;
			}
		}
		return ans;
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
      	System.out.println("enter the value of target you want to get sum for:");
      	int target=sc.nextInt();
      	Q21TwoSumProblem q21=new Q21TwoSumProblem();
      	String message=q21.twoSumBruteForce(arr, target);
      	System.out.println(message);
      	int []ans=q21.twoSumOptimal(arr, target);
      	System.out.println("the two indices of the array whose sum is equal to target are "+ans[0]+" and "+ans[1]+" if they are -1 then we did not found any sum");
		sc.close();
	}
}
