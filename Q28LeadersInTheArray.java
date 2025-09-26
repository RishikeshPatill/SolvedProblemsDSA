package striverDsaSheet;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Q28LeaderInArray {
	public ArrayList<Integer> leadersInArrayBruteForce(int []arr){
		ArrayList<Integer>ans=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			boolean leader=true;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					leader=false;
					break;
				}
			}
			if(leader==true) {
				ans.add(arr[i]);
			}
		}
		return ans;
	}
	public ArrayList<Integer> leadersInArrayOptimal(int []arr){
		ArrayList<Integer>ans=new ArrayList<>();
		int max=arr[arr.length-1];//as last element is always is leader 
		ans.add(max);
		for(int i=arr.length-2;i>=0;i--) {
			if(arr[i]>max) {
				ans.add(arr[i]);
				max=arr[i];
			}
		}
		Collections.reverse(ans);//cause we are traversing form the last
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
      	Q28LeaderInArray q28=new Q28LeaderInArray();
      	ArrayList<Integer>leaders=q28.leadersInArrayOptimal(arr);
      	System.out.println("the leaders of the array are:"+leaders);
      	sc.close();
	}
}
