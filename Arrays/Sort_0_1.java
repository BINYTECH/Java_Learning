/*##############################################################################################################################################
You have been given an integer array/list(ARR) of size N that contains only integers, 0 and 1. Write a function to sort this array/list.
Think of a solution which scans the array/list only once and don't require use of an extra array/list.

Sample Input 1:
7    //Array Size
0 1 1 0 1 0 1  //Array Elements
Sample Output 1:
0 0 0 1 1 1 1
##################################################################################################################################################*/
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
	
	Sort_0_1(arr);
	for(int i=0;i<size;i++)
	{
		System.out.print(arr[i]+" ");
	}
}
public static void Sort_0_1(int arr[])
{
int i=0;
int j=arr.length-1;
while(i<j)
{
	if(arr[i]==1)
	{
		arr[j]=arr[j]+arr[i];
		arr[i]=arr[j]-arr[i];
		arr[j]=arr[j]-arr[i];
		j--;
	}
	else
	 {
		i++;
	 }
  }
 }
}
