class Insertion_Sort
{
    // function for insertion sort
    public static void InsertionSort(int[] array, int size)
    {
        int temp, j;

        for(int i = 1; i < size; i++)
        {
            temp = array[i];
            j = i - 1;

            // Do swapping
            while(j >= 0 && array[j] > temp)
            {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = temp;
        }
    }

    // function ro print array
    public static void Print_Array(int[] array, int size)
    {
        for(int i = 0; i < size; i++)
            System.out.print(array[i] + " ");

        System.out.println();
    }

    public static void main(String[] args)
    {
        int[] array = {2, 4, 3, 1, 6, 8, 4};
        InsertionSort(array, 7);
        Print_Array(array, 7);
    }
}

// Output
// 1 2 3 4 4 6 8
