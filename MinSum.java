import java.util.Arrays;

public class MinSum
{
	public static void main(String[] args)
	{
		int[] arr = {1,2,2};
		//Sort the array!
		Arrays.sort(arr);
		int minsum = getMinimumUniqueSum(arr);
		System.out.println(minsum);
	}

	public static int getMinimumUniqueSum(int[] arr)
	{
		int prev = arr[0];
		int sum = arr[0];
		//Loop through the sorted array
		for(int i = 1; i < arr.length; i++)
		{
			//If the previous element exceeds the current i'th element of the array
			if(prev >= arr[i])
			{
				arr[i] = prev + 1;
			}
			sum+= arr[i];
			prev = arr[i];
		}
		return sum;
	}
}
