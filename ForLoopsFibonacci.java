import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		
     Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();

	 int n1=1,n2=1;
	 int n3=1;
     for(int i=3;i<=n;i++){
		n3=n1+n2;
		n1=n2;
		n2=n3;
	 }
    System.out.println(n3);	
	}

}
