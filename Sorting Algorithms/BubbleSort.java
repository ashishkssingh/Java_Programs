/*
# **********************************************************************;
# Project           : Learning Java
#
# Program name      : BubbleSort.java
#
# Author            : Ashish Singh
#
# Date created      : 20190107
#
# Purpose           : Implementing bubble sort algorithm in Java
#
# **********************************************************************;
*/

// Class that contains the bubbleSort function
class BubbleSort
{

    // Function that implements Bubble Sort algorithm
    void bubbleSort(int unsorted_array[])
    {
        // Get size of array to execute loop
        int array_size = unsorted_array.length;

        // Outer loop to select the element to be compared
        for (int i = 0; i < array_size-1; i++)

            // Inner loop to compare all other elements with the selected element
            for (int j = 0; j < array_size-i-1; j++)

                // If jth element is greater than (j+1)th element then interchange positions
                if (unsorted_array[j] > unsorted_array[j+1])
                {
                    int temp = unsorted_array[j];
                    unsorted_array[j] = unsorted_array[j+1];
                    unsorted_array[j+1] = temp;
                }
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
        // Object of the sorting algorithm
        BubbleSort ob = new BubbleSort();

        // Array to be sorted
        int[] unsorted_array = new int[]{64, 34, 25, 12, 22, 11, 90};

        // Calling sorting algorithm function
        ob.bubbleSort(unsorted_array);

        // Print the sorted array
        System.out.println("Sorted array");
        ob.printArray(unsorted_array);
    }
}
