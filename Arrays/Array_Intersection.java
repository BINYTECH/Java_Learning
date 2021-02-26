/*Array Intersection:- Given two arrays print the common elements present in both the arrays.
arr1={7,5,6,4};
arr2={1,5,7};
Output={7,5}    */

import java.util.Scanner;

public class Solution {
	public static void main(String[] args){
	int []arr= {7,6,5};
	int arr2[]= {7,5,8,9,45,78};
	Intersection(arr,arr2);
	}
public static void Intersection(int arr[],int []arr2)
{

	for(int i=0;i<arr.length;i++)
	{
	for(int j=0;j<arr2.length;j++)
		{
		if(arr[i]==arr2[j])
		{
			System.out.print(arr[i]+" ");
			arr2[j]=Integer.MIN_VALUE;
		
		}
	  }
	}
}

}
