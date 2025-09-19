package striverDsaSheet;
import java.util.Scanner;
public class Pattern1 {

	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of rows:");
		int row=sc.nextInt();
		System.out.println("Enter the value of columns:");
		int col=sc.nextInt();
		System.out.println("enter the number you want to print");
		int n=sc.nextInt();
		
	    System.out.println("here is the pattern 1:");
	    System.out.println("----------------------");
	    for(int i=1;i<=row;i++) {
	    	for(int j=1;j<=col;j++) {
	    		System.out.print(n+" ");
	    	}
	    	System.out.println();
	    }
	    sc.close();
	   		
	}
}
