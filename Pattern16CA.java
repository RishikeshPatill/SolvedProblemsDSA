package striverDsaSheet;
import java.util.Scanner;
public class Pattern16CA {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of rows:");
		int num=sc.nextInt();
		System.out.println("Pattern 16 is here");
		System.out.println("-----------------");
		for(int i=num;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			
			}
			System.out.println();
		}
		sc.close();
	}
}
