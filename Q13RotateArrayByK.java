package striverDsaSheet;
import java.util.Arrays;
import java.util.Scanner;
public class Q13RotateArrayByK {
	
	public void rotateArray(int []arr,int rotate,String direction) {
		if(rotate==0) {
			return ;
		}
		int temp=0;
		if(direction.equalsIgnoreCase("left")) {
			temp=arr[0];
			for(int i=0;i<arr.length-1;i++) {
				arr[i]=arr[i+1];
			}
			arr[arr.length-1]=temp;
		}else {
			temp=arr[arr.length-1];
			for(int i=arr.length-1;i>0;i--) {
				arr[i]=arr[i-1];
			}
			arr[0]=temp;
		}
		rotateArray(arr,rotate-1,direction);
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
     	int rotate=0;
     	while(true) {
     		System.out.println("enter number by what you want to rotate the array:");
            rotate=sc.nextInt();
            if(rotate<arr.length) {
            	System.out.println("okay got valid rotation value");
            	break;
            }else {
            	System.out.println("we can't rotate the array greater then its length enter a valid input");
            }
     	}
     	String option="";
     	while(true) {
     		System.out.println("enter which side you want to rotate the array either left or right:");
     		option=sc.next();
     		if(option.equalsIgnoreCase("right") || option.equalsIgnoreCase("left")) {
     			System.out.println("okay got valid direction value");
     			break;
     		}else {
     			System.out.println("invlid direction input please enter the valid input as stated in the options");
     		}
     	}
     	System.out.println("Array Before Rotation");
     	System.out.println(Arrays.toString(arr));
     	Q13RotateArrayByK q13=new Q13RotateArrayByK();
     	q13.rotateArray(arr, rotate, option);
     	System.out.println("Array After Rotation");
     	System.out.println(Arrays.toString(arr));
		sc.close();
	}
}
