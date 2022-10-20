/*
 Given a sorted array [0...n-1], it contains all integers from 0 to n except one missing integer
 write two methods that find the missing integer
 a) a method similar to the linear search
 b) a method similar to the binary search
 find the time complexity for the best, worst, and average cases
 */
public class MT
{
	public static void main(String[] args)
	{
		int a[] = {0, 1, 2, 3, 5, 6, 7, 8, 9, 10};
		System.out.println(findMissingInt(a));
		System.out.println(findMissingInt2(a));
	}	
		
	public static int findMissingInt(int []a) //O(n)
	{
		for (int i=0; i<a.length; i++)
			if (a[i]+1 != a[i+1] )
				return a[i]+1;
		return -1;
	}
	
	public static int findMissingInt2(int []a) //O(log n)
	{
		int low = 0;
		int high = a.length-1;
		int mid;
		while (low <= high)
		{
			mid = (low+high)/2;
			if (a[mid]-1 == mid)
				return a[mid]-1;
			else if (mid <= a[mid]-1)
				high = mid - 1;
			else if (mid > a[mid]-1)
				low = mid + 1;
		}
		return -1;
	}
	
	//best case for both: O(1)
}

