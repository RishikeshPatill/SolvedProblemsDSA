package striverDsaSheet;
import java.util.Scanner;
public class Q30AllConcepts2DArray {
	
	public static void main(String[] args) {
//		concept-1 take inputs in 2d array;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows of the array as m:");
      	int m=sc.nextInt();
      	System.out.println("enter the number of cols of the array as n:");
      	int n=sc.nextInt();
      	System.out.println("now enter the values in the m*n array:");
      	int arr[][]=new int[m][n];
      	for(int i=0;i<m;i++) {
      		for(int j=0;j<n;j++) {
      			arr[i][j]=sc.nextInt();
      		}
      	}
//      concept-2 number of rows and columns in 2d array
      	m=arr.length;
      	n=arr[0].length; 
      	
//      concept-3 declaration we know very well    
      	
//      concept-4 row wise traversal in 2d array
      	for(int i=0;i<arr.length;i++) {
      		for(int j=0;j<arr[i].length;j++) {
      			System.out.println(arr[i][j]+" ");
      		}
      	}
      	
//      concept-5 column wise traversal in 2d array
      	for(int j=0;j<arr[0].length;j++) {
      		for(int i=0;i<arr.length;i++) {
      			System.out.println(arr[i][j]+" ");
      		}
      	}
      	
//      concept-6 Jagged Arrays
      	int[][] jagged = new int[3][];
      	jagged[0] = new int[2]; // row 0 → 2 elements
      	jagged[1] = new int[3]; // row 1 → 3 elements
      	jagged[2] = new int[4]; // row 2 → 4 elements
      	
//      concept-7 sum of all elements
      	int sum=0;
      	for(int i=0;i<arr.length;i++) {
      		for(int j=0;j<arr[i].length;j++) {
      			sum=sum+arr[i][j];
      		}
      	}
      	
//      concept-8 print diagonals
      	for(int i=0;i<arr.length;i++) {
      		System.out.println(arr[i][i]);
      	}
      	
//      concept-9 print anti-diagonals
      	for(int i=0;i<arr.length;i++) {
      		System.out.println(arr[i][(arr.length-1)-i]);
      	}
      	
//      concept-10 transpose of matrix
      	int rows=arr.length;
      	int cols=arr[0].length;
