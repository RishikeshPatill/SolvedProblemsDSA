package striverDsaSheet;
import java.util.Scanner;
public class Pattern17CA {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of rows:");
		int num=sc.nextInt();
		System.out.println("Pattern 17 is here");
		System.out.println("-----------------");
		for(int i=1;i<=num;i++) {
			    int n=num;
			for(int j=1;j<=i;j++) {
				System.out.print(n+" ");
				n--;
			}
			System.out.println();
		}
		sc.close();
	}
}
