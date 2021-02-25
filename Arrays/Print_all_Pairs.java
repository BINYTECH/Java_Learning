/*Print all pairs of the array element 
(1,4) (1,7) (1,6) (1,5) (4,7) (4,6) (4,5) (7,6) (7,5) (6,5) */
import java.util.Scanner;

public class Solution {
	public static void main(String[] args){
	int []arr= {1,4,7,6,5};
	printPairs(arr);
	}
public static void printPairs(int arr[])
{
	int n=arr.length;
	for(int i=0;i<n-1;i++)
	{
	for(int j=i+1;j<n;j++)
		{
		System.out.println("("+arr[i]+","+arr[j]+")");
		}
	}
}
}

