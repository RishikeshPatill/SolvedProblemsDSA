package striverDsaSheet;
import java.util.Scanner;
public class Pattern20CA {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows:");
		int num=sc.nextInt();
		System.out.println("Pattern 20 is here");
		System.out.println("------------------");
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num-i;j++) {
				System.out.print(" "+" ");
			}
			for(int m=1;m<=i;m++) {
				System.out.print(m+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
