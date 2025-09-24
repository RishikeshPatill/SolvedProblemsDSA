package striverDsaSheet;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Q14MoveZeroesToEnd {
	public void moveZeroesToEndBruteforce(int []arr) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				list.add(arr[i]);
			}
		}
		for(int i=0;i<list.size();i++) {
			arr[i]=list.get(i);
		}
		for(int i=list.size();i<arr.length;i++) {
			arr[i]=0;
		}
	}
	public void moveZeroesToEndOptimal(int []arr) {
		int j=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				j=i;
				break;
			}
		}
		if(j==-1) {
			return ;
		}
		for(int i=j+1;i<arr.length;i++) {
			if(arr[i]!=0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
			}
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
     	System.out.println("Array before operation bruteforce");
     	System.out.println(Arrays.toString(arr));
     	Q14MoveZeroesToEnd q14=new Q14MoveZeroesToEnd();
     	q14.moveZeroesToEndBruteforce(arr);
     	System.out.println("Array after the operation bruteforce");
     	System.out.println(Arrays.toString(arr));
     	q14.moveZeroesToEndOptimal(arr);
     	System.out.println("Array after the operation optimal");
     	System.out.println(Arrays.toString(arr));
		sc.close();
	}
}
