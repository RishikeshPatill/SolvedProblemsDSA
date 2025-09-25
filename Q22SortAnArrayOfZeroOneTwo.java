package striverDsaSheet;
import java.util.Arrays;
import java.util.Scanner;
public class Q22SortAnArrayOfZeroOneTwo {
	public void Q22SortAnArrayBruteForce(int []arr) {
		int count0=0,count1=0,count2=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				count0++;
			}else if(arr[i]==1) {
				count1++;
			}else {
				count2++;
			}
		}
		for(int i=0;i<count0;i++) {
			arr[i]=0;
		}
		for(int i=count0;i<count0+count1;i++) {
			arr[i]=1;
		}
		for(int i=count0+count1;i<arr.length;i++) {
			arr[i]=2;
		}
	}
	public void Q22SortAnArrayOptimal(int []arr) {
		int low=0,mid=0,high=arr.length-1;
		while(mid<=high) {
			if(arr[mid]==0) {
				int temp=arr[low];
				arr[low]=arr[mid];
				arr[mid]=temp;
				mid++;
				low++;
			}else if(arr[mid]==1) {
				mid++;		
			}else {
				int temp=arr[mid];
				arr[mid]=arr[high];
				arr[high]=temp;
				high--;
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
      	Q22SortAnArrayOfZeroOneTwo q22=new Q22SortAnArrayOfZeroOneTwo();
//      	q22.Q22SortAnArrayBruteForce(arr);
      	q22.Q22SortAnArrayOptimal(arr);
      	System.out.println("the array after the sorting:");
      	System.out.println(Arrays.toString(arr));
		sc.close();
	}

}
