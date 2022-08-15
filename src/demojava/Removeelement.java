// Java program to remove an element
// from a specific index from an array
package demojava;
import java.util.Arrays;

class Removeelement {

	// Function to remove the element
	public static int[] removeTheElement(int[] arr, int index)
	{

		// If the array is empty
		// or the index is not in array range
		// return the original array
		if (arr != null && 0 <= index && index < arr.length)
		{

			

		// Create another array of size one less
		      int[] anotherArray = new int[arr.length - 1];

		// Copy the elements except the index
		// from original array to the other array
		      int k=0;
		        for (int i = 0; i < arr.length; i++)
		         {

			// if the index is
			// the removal element index
			                       if (i != index) 
			                       {
			                    	   anotherArray[k++] = arr[i]; 
				                   
			                        }

			// if the index is not
			// the removal element index
			                       
		          }
		             return anotherArray;
		 }
		// return the resultant array
 			
		else
		{
			System.out.println("same array no change");
			return arr;	
		}

		}
	// Driver Code
	public static void main(String[] args)
	{

		// Get the array
		int[] arr = { 1, 2, 3, 4, 5 };

		// Print the resultant array
		System.out.println("Original Array: "
						+ Arrays.toString(arr));

		// Get the specific index
		int index = 1;

		// Print the index
		System.out.println("Index to be removed: " + index);

		// Remove the element
		arr = removeTheElement(arr, index);

		// Print the resultant array
		System.out.println("Resultant Array: "
						+ Arrays.toString(arr));
	}
}
