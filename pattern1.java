public class Solution {
    public static void nForest(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        nForest(5); // Example to print a 5x5 star pattern
    }
}
