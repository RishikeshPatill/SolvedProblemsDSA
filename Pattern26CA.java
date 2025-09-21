package striverDsaSheet;
import java.util.Scanner;
public class Pattern26CA {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows:");
		int num=sc.nextInt();
		System.out.println("Pattern 26 is here");
		System.out.println("------------------");
		for(int i=num;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*"+" ");
			}
			for(int m=1;m<=2*(num-i);m++) {
				System.out.print(" "+" ");
			}
			for(int n=1;n<=i;n++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*"+" ");
			}
			for(int m=1;m<=2*(num-i);m++) {
				System.out.print(" "+" ");
			}
			for(int n=1;n<=i;n++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}

