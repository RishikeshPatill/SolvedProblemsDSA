package striverDsaSheet;
import java.util.Scanner;
public class Q25StockBuyAndSell {
	public int stockBuySellBruteForce(int []arr) {
		int maxProfit=0;
		for(int i=0;i<arr.length;i++) {
			int profit=0;
			for(int j=i;j<arr.length;j++) {
				profit=arr[j]-arr[i];
				if(profit>maxProfit) {
					maxProfit=profit;
				}
			}
		}
		return maxProfit;
	}
	public int stockBuySellOptimal(int []arr) {
		int maxProfit=0;
		int profit=0;
		int minValue=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<minValue) {
				minValue=arr[i];
			}
			profit=arr[i]-minValue;
			if(profit>maxProfit) {
				maxProfit=profit;
			}
		}
		return maxProfit;
	}
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array:");
      	int num=sc.nextInt();
      	System.out.println("enter the values in the array:");
      	int []arr=new int[num];
      	for(int i=0;i<num;i++) {
      		arr[i]=sc.nextInt();
      	}	
      	Q25StockBuyAndSell q25=new Q25StockBuyAndSell();
      	int maxProfit1=q25.stockBuySellBruteForce(arr);
      	System.out.println("max profit by brute force:"+maxProfit1);
      	int maxProfit2=q25.stockBuySellOptimal(arr);
      	System.out.println("max profit by optimal:"+maxProfit2);
		sc.close();
	}
}
