package Sorting;

/**
 * Created by sumon.chatterjee on 13/07/17.
 */
public class QuickSort {

    //quick sort with middle element as pivot

        public void sort(int[] A) {
            if (A == null || A.length == 0)
                return;
            partition(A, 0, A.length - 1);
        }

//        public void quicksort(int[] A, int left, int right) {
//            int pivot = A[left + (right - left) / 2];
//            int i = left;
//            int j = right;
//            while (i <= j) {
//                while (A[i] < pivot) {
//                    i++;
//                }
//                while (A[j] > pivot) {
//                    j--;
//                }
//                if (i <= j) {
//                    exchange(A, i, j);
//                    i++;
//                    j--;
//                }
//            }
//
//
//            printArr(A, right + 1);
////            if(left < j)
////                quicksort(A,left,j);
////            if(i < right)
////                quicksort(A,i,right);
//        }



    public void partition(int[] array, int low , int high) {
        int mid = low + (high - low)/2;
        int left = low;
        int right = high;
        int pivot = array[mid];

        while (left < right) {

            while (array[left] <= pivot && left < high) {
                left++;
            }

            while (array[right] > pivot && right > low) {
                right--;
            }

            if (left < right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }


        }
        array[mid] = array[right];
        array[right] = pivot;

        printArr(array, array.length);


    }

        public void exchange(int A[], int i, int j){
            int temp=A[i];
            A[i]=A[j];
            A[j]=temp;
        }



        public static void main(String[] args){
            int[] data = {1,2,5,6,2};
            //int[] data = {91,2,100,1,80};
            QuickSort sorting= new QuickSort();
            sorting.sort(data);

        }

        private void printArr(int arr[], int n) {
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

    }


