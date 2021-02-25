import java.util.Scanner;

public class Solution {
//TakeInput() function is taking User Input
public static int[] TakeInput() {
	Scanner s=new Scanner (System.in);
	int n=s.nextInt();
	int arr[]=new int[n];
	
	for(int i=0;i<n;i++)
	{
		arr[i]=s.nextInt();
	}
	return arr;
}
//Largest() to search Largest element in the given array.
public static int Largest(int arr[])
{
	int max=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>max)
		{
			max=arr[i];
		}
	}
	return max;
}
	public static void main(String[] args) {
	int arr[]=TakeInput();
	System.out.println(Largest(arr));
	
	}

}
