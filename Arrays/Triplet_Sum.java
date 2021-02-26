/*#############################################################################################################################################
You have been given a random integer array/list(ARR) and a number X. Find and return the number of triplets in the array/list which sum to X.
Sample Input 1:
7   //Array size
1 2 3 4 5 6 7   //Array elements
12
Sample Output 1:
5
Explanation:Triplet Pairs which form sum equal to 12 are (1,4,7),(1,5,6),(2,3,7),(6,4,2),(3,4,5)
################################################################################################################################################*/
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
	int sum=s.nextInt();
	
	System.out.println(Triplet_Sum(arr, sum));
	}
public static int Triplet_Sum(int arr[], int sum)
{
int count=0;
	for(int i=0;i<arr.length;i++)
	{
	for(int j=i+1;j<arr.length-1;j++)
		{
		for(int k=j+1;k<arr.length;k++)
		{
		if(arr[i]+arr[j]+arr[k]==sum)
		{
			count=count+1;
		
		}
	  }
	}
   }
	return count;
  }
}
