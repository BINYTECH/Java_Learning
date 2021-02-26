/*###################################################################################################
You have been given an integer array/list(ARR) of size N which contains numbers from 0 to (N - 2). 
Each number is present at least once. That is, if N = 5, the array/list constitutes values ranging 
from 0 to 3 and among these, there is a single integer value that is present twice. 
You need to find and return that duplicate number present in the array.
  
 Sample Input 1:
9 //Array size
0 7 2 5 4 7 1 3 6  //Array elements

Sample Output 1:
7 

################################################################################################################*/

import java.util.Scanner;

public class Solution {
	public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	int size=s.nextInt();
	int arr[]=new int[size];
	
	for(int i=0;i<size;i++)
	{
		arr[i]=s.nextInt();
	}
	System.out.println(Duplicate_element(arr));
	}
public static int Duplicate_element(int arr[])
{
int d=0;
	for(int i=0;i<arr.length;i++)
	{
	for(int j=i+1;j<arr.length;j++)
		{
		if(arr[i]==arr[j])
		{
			d=arr[j];
		
		}
	  }
	}
	return d;
}

}
