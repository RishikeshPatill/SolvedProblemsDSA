public class Solution {
    public static void nLetterTriangle(int n) {
        for(int i=n;i>=1;i--){
            char ch='A';
            for(char j=ch;j<=ch+i-1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
