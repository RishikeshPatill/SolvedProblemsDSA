package striverDsaSheet;
import java.util.Scanner;
public class Pattern22CA {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows:");
		int num=sc.nextInt();
		System.out.println("Pattern 22 is here");
		System.out.println("------------------");
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num-i;j++) {
				System.out.print(" "+" ");
			}
			for(int m=i;m>=1;m--) {
				System.out.print(m+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
