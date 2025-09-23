package striverDsaSheet;
import java.util.Scanner;
public class Q10ArraySortedCheck {
	
	public boolean arraySortedCheck(int []arr,String order) {
		if(arr.length<2) {
			return true;
		}
		for(int i=1;i<arr.length;i++) {
			if(order.equalsIgnoreCase("ascending")) {
				if(arr[i-1]>arr[i]) {
					return false;
				}
			}else {
				if(arr[i-1]<arr[i]) {
					return false;
				}
			}
			
		}
		return true;
	}
    public static void main(String []args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("eneter the size of the array:");
    	int num=sc.nextInt();
    	System.out.println("enter the values in the array:");
    	int []arr=new int[num];
    	for(int i=0;i<num;i++) {
    		arr[i]=sc.nextInt();
    	}
    	String order="";
    	while(true) {
    		System.out.println("enter the order of sorting to check either ascending or descending: enter below-");
        	order=sc.next();
        	if(order.equalsIgnoreCase("ascending") || order.equalsIgnoreCase("descending")) {
        		System.out.println("thanks for the input we got the proper input");
        		break;
        	}else {
        		System.out.println("enter the valid input as stated in the above options");
        	}
    	}
    	Q10ArraySortedCheck q10=new Q10ArraySortedCheck();
    	System.out.println("the give array is sorted:"+q10.arraySortedCheck(arr,order));
    	sc.close();
    }
}
