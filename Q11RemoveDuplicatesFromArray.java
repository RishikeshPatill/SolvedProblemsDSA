package striverDsaSheet;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;
public class Q11RemoveDuplicateFromSortedArray {
	
	public TreeSet<Integer> removeDuplicateFromArray(int []arr) {
		TreeSet<Integer> set=new TreeSet<>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		return set;
	}
	public int removeDuplicateOptimal(int []arr) {
		if(arr.length==0) {
			return -1;
		}
		int i=0;
		for(int j=1;j<arr.length;j++) {
			if(arr[i]!=arr[j]) {
				arr[i+1]=arr[j];
				i++;
			}
		}
		return i+1;
	}
 public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
 	System.out.println("enter the size of the array:");
 	int num=sc.nextInt();
 	System.out.println("enter the values in the array:");
 	int []arr=new int[num];
 	for(int i=0;i<num;i++) {
 		arr[i]=sc.nextInt();
 	}	 
 	Q11RemoveDuplicateFromSortedArray q11=new Q11RemoveDuplicateFromSortedArray();
 	TreeSet<Integer> newSet=q11.removeDuplicateFromArray(arr);
 	System.out.println("the unique array after removing duplicates using sets:");
 	System.out.println(newSet);
 	int newSize=q11.removeDuplicateOptimal(arr);
 	System.out.println("the unique elements in array after optimal approach:");
 	System.out.println(Arrays.toString(arr));
 	System.out.println("the only unique elements array:");
 	for(int i=0;i<newSize;i++) {
 		System.out.println(arr[i]);
 	}
 	sc.close();
 }
}
