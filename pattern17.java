public class Solution {
    
    public static void alphaHill(int n) {
        for(int i=1;i<=n;i++){
            char ch='A';
            char k=(char)(ch+i-1);
            char m=(char)(ch+i-2);
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(char j=ch;j<=k;j++){
                System.out.print(j+" ");
            }
            for(char j=m;j>='A';j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
}

}