/*
# **********************************************************************;
# Project           : Learning Java
#
# Program name      : SelectionSort.java
#
# Author            : Ashish Singh
#
# Date created      : 20190108
#
# Purpose           : Implementing selection sort algorithm in Java
#
# **********************************************************************;
*/

// Class that contains the Selection Sort function
class SelectionSort
{

    // Function that implements Selection Sort algorithm
    void selectionSort(int unsorted_array[])
    {
        // Get size of array to execute loop
        int array_size = unsorted_array.length;

        // Outer loop to select the element to be compared
        for (int i = 0; i < array_size-1; i++){

          // Set index of first element as the smallest element
          int smallest = i;

            // Inner loop to compare all other elements with the selected element
            for (int j = i; j < array_size-i-1; j++){

              // If any element has a smaller value then the smallest selected element then set the smallest to new value
              if(unsorted_array[j] < unsorted_array[smallest])
                smallest = j;
            }

          // Once compared through all the values swap the smallest and the (i)th element
          int temp = unsorted_array[i];
          unsorted_array[i] = unsorted_array[smallest];
          unsorted_array[smallest] = temp;
        }

    }

    // Function to print the sorted array as a console output
    void printArray(int sorted_array[])
    {
        int array_size = sorted_array.length;s
        for (int i=0; i<array_size; ++i)
            System.out.print(sorted_array[i] + " ");
        System.out.println();
    }

    // Main function to execute the Selection Sort algorithm.
    public static void main(String args[])
    {
        // Object of the sorting algorithm
        SelectionSort ob = new SelectionSort();

        // Array to be sorted
        int[] unsorted_array = new int[]{64, 34, 25, 12, 22, 11, 90};

        // Calling sorting algorithm function
        ob.selectionSort(unsorted_array);


        System.out.println("Sorted array");
        ob.printArray(unsorted_array);
    }
}
