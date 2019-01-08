/*
# **********************************************************************;
# Project           : Learning Java
#
# Program name      : BubbleSort.java
#
# Author            : Ashish Singh
#
# Date created      : 20181215
#
# Purpose           : Implementing bubble sort algorithm in Java
#
# **********************************************************************;
*/

// Java program for implementation of Bubble Sort
class BubbleSort
{
    void bubbleSort(int unsorted_array[])
    {
        int array_size = unsorted_array.length;
        for (int i = 0; i < array_size-1; i++)
            for (int j = 0; j < array_size-i-1; j++)
                if (unsorted_array[j] > unsorted_array[j+1])
                {
                    // swap arr[j+1] and arr[i]
                    int temp = unsorted_array[j];
                    unsorted_array[j] = unsorted_array[j+1];
                    unsorted_array[j+1] = temp;
                }
    }

    /* Prints the array */
    void printArray(int sorted_array[])
    {
        int array_size = sorted_array.length;
        for (int i=0; i<array_size; ++i)
            System.out.print(sorted_array[i] + " ");
        System.out.println();
    }

    // Driver method to test above
    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        int[] unsorted_array = new int[]{64, 34, 25, 12, 22, 11, 90};
        ob.bubbleSort(unsorted_array);
        System.out.println("Sorted array");
        ob.printArray(unsorted_array);
    }
}
