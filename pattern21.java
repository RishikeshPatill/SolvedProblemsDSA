public class Solution {
    public static void getStarPattern(int n) {
        for (int i = 1; i <= n; i++) {  // Outer loop for rows
            for (int j = 1; j <= n; j++) {  // Inner loop for columns
                // Print '*' at the borders or corners
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); // Print space for inner columns
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}