/*
# **********************************************************************;
# Project           : Learning Java
#
# Program name      : RecursiveBubbleSort.java
#
# Author            : Ashish Singh
#
# Date created      : 20190111
#
# Purpose           : Implementing recursive bubble sort algorithm in Java
#
# **********************************************************************;
*/

// Class that contains the bubbleSort function
class RecursiveBubbleSort
{

    // Function that implements Bubble Sort algorithm
    int recursiveBubbleSort(int unsorted_array[], int array_size)
    {

        // Base condition to terminate the recursion
        if(array_size == 1)
            return 0;
            

        // Outer loop to select the element to be compared
        for (int i = 0; i < array_size-1; i++)

            // If jth element is greater than (j+1)th element then interchange positions
            if (unsorted_array[i] > unsorted_array[i+1])
            {
                    int temp = unsorted_array[i];
                    unsorted_array[i] = unsorted_array[i+1];
                    unsorted_array[i+1] = temp;
            }

        recursiveBubbleSort(unsorted_array, array_size-1);

        return 0;

    }

    // Function to print the sorted array as a console output
    void printArray(int sorted_array[])
    {
        int array_size = sorted_array.length;
        for (int i=0; i<array_size; ++i)
            System.out.print(sorted_array[i] + " ");
        System.out.println();
    }

    // Main function to execute the Bubble Sort algorithm.
public static void main(String args[])
    {
        RecursiveBubbleSort ob = new RecursiveBubbleSort();

        int[] unsorted_array = new int[]{64, 34, 25, 12, 22, 11, 90};

        // Get size of array to execute loop
        int array_size = unsorted_array.length;

        ob.recursiveBubbleSort(unsorted_array, array_size);

        System.out.println("Sorted array");

        ob.printArray(unsorted_array);
    }
}
