Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            sc.nextLine();
            String s = sc.next();
            Solution obj = new Solution();
            int ans = obj.dataTypeSize(s);
            String Character = "Character";
            if (Character.equals(s) && ans == 2) {
                ans = 1;
            }
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends

class Solution {
    static int dataTypeSize(String str) {
       if(str.equalsIgnoreCase("byte"))
       return //{ 1;
       else if(str.equalsIgnoreCase("short"))
       return 2;
       else if(str.equalsIgnoreCase("integer"))
       return 4;
       else if(str.equalsIgnoreCase("long"))
       return 8;
       else if(str.equalsIgnoreCase("float"))
       return 4;
       else if(str.equalsIgnoreCase("double"))
       return 8;
       else if(str.equalsIgnoreCase("character"))
       return 2;
       else if(str.equalsIgnoreCase("boolean"))
       return 1;
       else 
       return -1;
    }
}