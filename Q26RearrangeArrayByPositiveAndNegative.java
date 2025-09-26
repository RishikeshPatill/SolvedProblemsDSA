package striverDsaSheet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Q26RearrangeArrayByPositiveNegatives {
	public void rearrangeArrayBruteForce(int []arr) {
		ArrayList<Integer> pos=new ArrayList<>();
		ArrayList<Integer> neg=new ArrayList<>();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				pos.add(arr[i]);
			}else {
				neg.add(arr[i]);
			}
		}
		for(int i=0;i<(arr.length/2);i++) {
			arr[2*i]=pos.get(i);
			arr[2*i+1]=neg.get(i);
		}
	}
	public void rearrangeUnEqualArray(int []arr) {
		ArrayList<Integer>pos=new ArrayList<>();
		ArrayList<Integer>neg=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				neg.add(arr[i]);
			}else {
				pos.add(arr[i]);
			}
		}
		//now if positive and negatives are not equal then we have to fill in the rest of the positive and negatives
		if(pos.size()<neg.size()) {
			for(int i=0;i<pos.size();i++) {
				arr[2*i]=pos.get(i);
				arr[2*i+1]=neg.get(i);
			}
			int index=pos.size()*2;
			for(int i=pos.size();i<neg.size();i++) {
				arr[index]=neg.get(i);
				index++;
			}
		}else {
			for(int i=0;i<neg.size();i++) {
				arr[2*i]=pos.get(i);
				arr[2*i+1]=neg.get(i);
			}
			int index=neg.size()*2;
			for(int i=neg.size();i<pos.size();i++) {
				arr[index]=pos.get(i);
				index++;
			}
		}
	}
	public ArrayList<Integer> rearrangeArrayOptimal(int []arr) {
		ArrayList<Integer> ans=new ArrayList<>(Collections.nCopies(arr.length, 0));
		int posIndex=0,negIndex=1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				ans.set(posIndex, arr[i]);
				posIndex=posIndex+2;
			}else{
				ans.set(negIndex, arr[i]);
				negIndex=negIndex+2;
			}
		}
		return ans;
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
		Q26RearrangeArrayByPositiveNegatives q26=new Q26RearrangeArrayByPositiveNegatives();
		q26.rearrangeArrayBruteForce(arr);
		sc.close();
	}
}
