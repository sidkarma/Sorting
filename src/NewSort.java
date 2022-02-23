
public class NewSort
{
	void sort(int arr[])
    {
        int len = arr.length;
  
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < len-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < len; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
  
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
  
    // Prints the array
    void printArray(int arr[])
    {
        int len = arr.length;
        for (int i=0; i<len; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
  
    // Driver code to test above
    public static void main(String args[])
    {
    	NewSort ob = new NewSort();
        int arr[] = {9,8,6,3,2,1,99};
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}