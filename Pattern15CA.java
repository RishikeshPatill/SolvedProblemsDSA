package striverDsaSheet;
import java.util.Scanner;
public class Pattern15CA {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of rows:");
		int num=sc.nextInt();
		System.out.println("Pattern 15 is here");
		System.out.println("-----------------");
		for(int i=num;i>=1;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print("*"+" ");
			
			}
			System.out.println();
		}
		sc.close();
	}
}
