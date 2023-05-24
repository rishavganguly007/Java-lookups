package src.codingProblems;

public class Sort {

    public static void bubbleSort(int[] arr, int n)
    {
        for (int i =0; i < n; i++)
        {
            for (int j = 0; j < n - i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i : arr)
            System.out.print(i + " ");
    }
    public static void main(String[] args) {
        int [] arr = {4,2,45,6,31,8};
        bubbleSort(arr, arr.length);


    }

}
