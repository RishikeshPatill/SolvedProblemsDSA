package striverDsaSheet;
import java.util.Scanner;
public class Pattern6CA {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of rows:");
		int row=sc.nextInt();
		System.out.println("enter the value of columns:");
		int col=sc.nextInt();
		System.out.println("Pattern 6 is here");
		System.out.println("-----------------");
		for(int i=1;i<=row;i++) {
			char ch= (char)('a'+i-1);
			for(int j=1;j<=col;j++) {
				System.out.print(ch+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
