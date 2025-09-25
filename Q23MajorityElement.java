package striverDsaSheet;
import java.util.Arrays;
import java.util.Scanner;
public class Q23MajorityElement {
	public int majorityElementBruteForce(int []arr) {
		int majorityElement=-1;
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count>(arr.length/2)) {
				majorityElement=arr[i];
			}
		}
		return majorityElement;
	}
	public int majorityElementInSortedArray(int []arr) {
		int majorityElement=-1;
		Arrays.sort(arr);
		int count=1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==arr[i-1]) {
				count++;
			}else {
				count=1;
			}
			if(count>(arr.length/2)) {
				majorityElement=arr[i];
				break;
			}
		}
		return majorityElement;
	}
	public int majorityElementOptimal(int []arr) {
		int freq=0,ans=0;
		for(int i=0;i<arr.length;i++) {
			if(freq==0) {
				ans=arr[i];
			}
			if(ans==arr[i]) {
				freq++;
			}else {
				freq--;
			}
		}
		//we have to this one extra step if we do not no that answer will exist or not
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==ans) {
				count++;
			}
		}
		if(count>(arr.length/2)) {
			return ans;
		}
		else {
			return -1;
		}
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
      	Q23MajorityElement q23=new Q23MajorityElement();
      	int majorityElement=q23.majorityElementBruteForce(arr);
      	System.out.println("the majority element of the array is:"+majorityElement);
		sc.close();
	}
}
