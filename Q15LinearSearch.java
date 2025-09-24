package striverDsaSheet;
import java.util.Scanner;
public class Q15LinearSearch {
	public int linearSearch(int []arr,int value) {
		int index=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==value) {
				index=i;
				break; // for first occurrence we use break if we want last then we remove this line
			}
		}
		return index;
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
      	System.out.println("enter the number you want to find");
      	int number=sc.nextInt();
      	Q15LinearSearch q15=new Q15LinearSearch();
      	int result=q15.linearSearch(arr, number);
      	System.out.println("the resulted index of the number you wanted to find is:"+result+" if the output is -1 then there is no such a number in the array");
		sc.close();
	}
}
