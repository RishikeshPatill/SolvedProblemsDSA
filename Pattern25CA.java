package striverDsaSheet;
import java.util.Scanner;
public class Pattern25CA {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows:");
		int num=sc.nextInt();
		System.out.println("Pattern 25 is here");
		System.out.println("------------------");
		for(int i=num;i>=1;i--) {
			for(int j=1;j<=num-i;j++) {
				System.out.print(" "+" ");
			}
			for(int m=2*i-1;m>=1;m--) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
