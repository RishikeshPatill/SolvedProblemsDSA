package striverDsaSheet;
import java.util.Arrays;
import java.util.Scanner;
public class Q29LongestConsecutiveSequenceInArray {
	public int longestConsecutiveSequenceBruteForce(int []arr) {
		if(arr.length==0) {
			return 0;
		}
		int count=1;
		int longest=1;
		Arrays.sort(arr);
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==arr[i-1]+1) {
				count++;
			}else if(arr[i] != arr[i-1]) {
				//else if instead of else because we cant restart the count if arr[i]==arr[i-1] right so when not equal then only restart the count right that's it 
				count=1;
			}
			if(count>longest) {
				longest=count;
			}
		}
		return longest;
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
      	Q29LongestConsecutiveSequenceInArray q29=new Q29LongestConsecutiveSequenceInArray();
      	int longest=q29.longestConsecutiveSequenceBruteForce(arr);
      	System.out.println("the longest consecutive sequence in the array is:"+longest);
		sc.close();
	}
}
