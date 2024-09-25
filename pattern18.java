public class Solution {
    public static void alphaTriangle(int n) {
       for(int i=1;i<=n;i++){
           char ch=(char)('A'+n-1);
           char z=(char)(ch-i+1);
           for(char j=ch;j>=z;j--){
               System.out.print(j+" ");
           }
           System.out.println();
       }
    }
}