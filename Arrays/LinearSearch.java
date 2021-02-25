/*To search for an element linearly in the array if it's present print the index or else return -1*/

import java.util.Scanner;

public class Solution {
	public static void main(String[] args){
	Scanner s=new Scanner (System.in);
	int n=s.nextInt();
	int arr[]=new int[n];
	int se=s.nextInt();
	
	for(int i=0;i<n;i++)
	{
		arr[i]=s.nextInt();
	}
	System.out.println(LinearsearcH(arr,se));
}
public static int LinearsearcH(int arr[], int x)
{
	
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==x)
		{
			return i;
		}
	}
	return -1;
}

}
