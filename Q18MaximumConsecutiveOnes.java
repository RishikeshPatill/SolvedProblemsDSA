package striverDsaSheet;
import java.util.Scanner;
public class Q18MaximumConsecutiveOnes {
	public int maximumConsecutiveOnes(int []arr) {
		int maxCount=0;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1) {
				count++;
				if(maxCount<count) {
					maxCount=count;
				}
			}else {
				count=0;
			}
		}
		return maxCount;
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
      	Q18MaximumConsecutiveOnes q18=new Q18MaximumConsecutiveOnes();
      	int result=q18.maximumConsecutiveOnes(arr);
      	System.out.println("maximum consecutive ones in the array:"+result);
		sc.close();
	}
}
