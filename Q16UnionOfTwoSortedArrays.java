package striverDsaSheet;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.ArrayList;
public class Q16UnionOfTwoSortedArrays {
	public TreeSet<Integer> unionOfArraysBruteForce(int arr1[], int arr2[]){
		TreeSet<Integer>set=new TreeSet<>();
		for(int i=0;i<arr1.length;i++) {
			set.add(arr1[i]);
		}
		for(int i=0;i<arr2.length;i++) {
			set.add(arr2[i]);
		}
		return set;
	}
	public ArrayList<Integer> unionOfArraysOptimal(int arr1[],int arr2[]) {
		ArrayList<Integer> union=new ArrayList<>();
		int i=0,j=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<=arr2[j]) {
				if(union.size()==0 || union.get(union.size()-1)!=arr1[i]) {
					union.add(arr1[i]);
				}
				i++;
			}else {
				if(union.size()==0 || union.get(union.size()-1)!=arr2[j]) {
					union.add(arr2[j]);
				}
				j++;
			}
		}
		while(i<arr1.length) {
			if(union.get(union.size()-1)!=arr1[i]) {
				union.add(arr1[i]);
			}
			i++;
		}
		while(j<arr2.length) {
			if(union.get(union.size()-1)!=arr2[j]) {
				union.add(arr2[j]);
			}
			j++;
		}
		return union;
	}
