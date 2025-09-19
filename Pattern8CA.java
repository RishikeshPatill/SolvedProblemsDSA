package striverDsaSheet;
import java.util.Scanner;
public class Pattern8CA {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of rows:");
		int row=sc.nextInt();
		System.out.println("enter the value of columns:");
		int col=sc.nextInt();
		System.out.println("Pattern 8 is here");
		System.out.println("-----------------");
		int count=1;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=col;j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
		sc.close();
	}
}
