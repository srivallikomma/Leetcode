package com.komma.arrays;

import java.util.Arrays;

public class MedianofTwoArrays{
public static double findMedianSortedArrays(int input1[], int input2[]) {
	 double median=0.0;
	 
	 if(input1.length > input2.length) {
		 return findMedianSortedArrays(input2,input1);
}
	 int l1=input1.length,l2=input2.length,totallength=l1+l2,temp;
	 int[] mergedarray=new int[totallength];
	 System.arraycopy(input1, 0, mergedarray, 0, l1);  
	 System.arraycopy(input2, 0, mergedarray, l1, l2);  
	
	 Arrays.sort(mergedarray);
	if(totallength%2==0) {
		median=mergedarray[totallength/2]+mergedarray[totallength/2-1];
       median=median/2;
	}
	else {
		median=mergedarray[totallength/2];
	}
	 return median;
}
public static void main (String args[]) {
	//MedianofTwoArrays mta=new MedianofTwoArrays();
	int[] arr1= {1,2};
	int[] arr2= {3,4};
	System.out.println("Median of two given arrys is  " +findMedianSortedArrays(arr1,arr2));
}
}

