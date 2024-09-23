//{ Driver Code Starts
//Initial Template for Java
//Initial Template for C++
//Initial Template for C++

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		
		//taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking count of total testcases
		int t=sc.nextInt();
		while(t-->0)
		{
		    //taking n
		    int n =sc.nextInt();
		    
		    //creating an object of class Geeks
		    Geeks obj=new Geeks();
		    
		    //calling printTable() method
		    //of class Geeks and passing
		    //n as an argument
		    obj.printTable(n);
		}
	
		
	}
}
// } Driver Code Ends
class Geeks {
    static void printTable(int n) {
        int m = 10; // Start from 10
        int table;

        while (m > 0) {
            table = m * n; // Calculate the table value
            System.out.print(table + " "); // Print the value followed by a space
            m--; // Decrement m
        }
        System.out.println(); // Print a new line after the table is printed
    }
}