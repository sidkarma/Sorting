import java.util.*;
public class BubbleSort
{
	static void bubbleSort(int arr[])
	{
		int len = arr.length;
	    for (int i = 0; i < len - 1; i++)
	      for (int j = 0; j < len - i - 1; j++)
	        if (arr[j] > arr[j + 1])
	        {
	        	int temp = arr[j];
	        	arr[j] = arr[j + 1];
	        	arr[j + 1] = temp;
	        }
	}

	  public static void main(String args[])
	  {
	    int[] arr = { 9,8,6,3,2,1,99 };
	    BubbleSort.bubbleSort(arr);
	    
	    System.out.println("Sorted Array is:");
	    System.out.println(Arrays.toString(arr));
	  }

}