public class HeapSort {
    public static void main(String args[])
    {
        int array[] = {43, 6, 3, 21, 0, 87, 5, 17};
        int n = array.length;

        HeapSort ob = new HeapSort();
        ob.sort(array);

        System.out.println("Отсортированный массив: ");
        printArray(array);
    }


    public void sort(int arr[])
        {
            int len = arr.length;
            for (int i = len / 2 - 1; i >= 0; i--)
                sorting(arr, len, i);
            for (int i=len-1; i>=0; i--)
            {
                int temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;
                sorting(arr, i, 0);
            }
        }

        void sorting(int arr[], int n, int i)
        {
            int largest = i;
            int left = 2*i + 1;
            int right = 2*i + 2;

            if (left < n && arr[left] > arr[largest])
                largest = left;

            if (right < n && arr[right] > arr[largest])
                largest = right;

            if (largest != i)
            {
                int swap = arr[i];
                arr[i] = arr[largest];
                arr[largest] = swap;

                sorting(arr, n, largest);
            }
        }


        static void printArray(int arr[])
        {
            int n = arr.length;
            for (int i=0; i<n; ++i)
                System.out.print(arr[i]+" ");
            System.out.println();
        }

    }
