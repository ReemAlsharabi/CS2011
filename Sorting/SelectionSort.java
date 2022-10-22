public class SelectionSort
{
	public static void main(String args[])
	{
		int arr[] = {1, 9, 3, 8, -1, 100, 0, 2, 8, 10};
		
		selectionSort(arr); // nondecreasing
		for (int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
	}
	
	//selection sort both best and worst case: O(n^2)
	
	public static void selectionSort(int a[]) // nondecreasing
	{
		for (int i=0; i<a.length-1; i++)
		{
			int minIndex = i;
			
			for (int j=i+1; j<a.length; j++)
				if (a[j] < a[minIndex])
					minIndex = j;
			
			int temp = a[i];
			a[i] = a[minIndex];
			a[minIndex] = temp;
		}
	}
}

