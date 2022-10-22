public class Test
{
	public static void main(String args[])
	{
		int arr[] = {1, 9, 3, 8, -1, 100, 0, 2, 8, 10};
    
    //selection sort
		SelectionSort selection = new SelectionSort();
		selection.selectionSort(arr);
		for (int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
    
    
		
	}
}
