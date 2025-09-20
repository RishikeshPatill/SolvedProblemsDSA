package striverDsaSheet;
import java.util.Scanner;
public class Pattern24CA {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows:");
		int num=sc.nextInt();
		System.out.println("Pattern 24 is here");
		System.out.println("------------------");
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num-i;j++) {
				System.out.print(" "+" ");
			}
			for(int m=1;m<=i;m++) {
				System.out.print(m+" ");
			}
			for(int n=i-1;n>=1;n--) {
				System.out.print(n+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
