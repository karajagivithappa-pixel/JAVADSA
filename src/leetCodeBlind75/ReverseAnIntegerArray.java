package leetCodeBlind75;

import java.util.Arrays;

public class ReverseAnIntegerArray {
	public static void main(String[] args) {
		int a[]= {2,5,3,6};
		for(int i=0;i<a.length/2;i++)
		{
			//assign first index value to temp
			int t=a[i];
			//assign last index value to 0th element
			a[i]=a[a.length-1-i];
			//assign temp to last index
			a[a.length-1-i]=t;
		}
		//print array using toString method of Arrays class by passing the result array
		System.out.println(Arrays.toString(a));
		
	}
}
