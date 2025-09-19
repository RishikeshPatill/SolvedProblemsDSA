package striverDsaSheet;
import java.util.Scanner;
public class Pattern5CA {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of rows:");
		int row=sc.nextInt();
		System.out.println("enter the value of columns:");
		int col=sc.nextInt();
		System.out.println("Pattern 5 is here");
		System.out.println("-----------------");
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=col;j++) {
				System.out.print(j*j+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
