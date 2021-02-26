/*Count how many pairs are there in the array which are equal to the given sum 
Ex:-
arr={1,5,6,4,3,8,2,7};
sum=10;
Output=3
Explanation:Pairs which are equal to the sum
(6,4),(3,7),(8,2)
*/
import java.util.Scanner;

public class Solution {
	public static void main(String[] args){
	int []arr= {7,6,5,1,4,5,6,10,2,4};
	int x=12;
	System.out.println(Pair_sum(arr,x));
	}
public static int Pair_sum(int arr[],int x)
{
int count=0;
	for(int i=0;i<arr.length;i++)
	{
	for(int j=i+1;j<arr.length;j++)
		{
		if(arr[i]+arr[j]==x)
		{
			count=count+1;
		
		}
	  }
	}
	return count;
}
}
