package Sorting;

/**
 * Created by sumon.chatterjee on 14/07/17.
 */
public class MergeSort {

    private int[] numbers;
    private int[] result;

     public void sort(int[] arr){
         this.numbers=arr;
         int low= 0;
         int high= numbers.length-1;
         int length= numbers.length;
         this.result=new int[length];
         mergeSort(low,high);
     }



     private void mergeSort( int low,int high){

         if (low < high) {
             // Get the index of the element which is in the middle
             int middle = low + (high - low) / 2;
             // Sort the left side of the array
             mergeSort(low, middle);
             // Sort the right side of the array
             mergeSort(middle + 1, high);
             // Combine them both
             merge(low, middle, high);
         }
     }


     private void merge(int low, int middle,int high){

         //copy array into a separate array
         for(int i=low;i<=high;i++){
             result[i] = numbers[i];
         }


         int i=low;
         int j=middle+1;
         int k=low;

// Copy the smallest values from either the left or the right side back
         // to the original array

         while (i <= middle && j <= high) {
             if (result[i] <= result[j]) {
                 numbers[k] = result[i];
                 i++;
             } else {
                 numbers[k] = result[j];
                 j++;
             }
             k++;
         }

         while (i <= middle) {
             numbers[k] = result[i];
             k++;
             i++;
         }

     }


     public static void main(String[]args){

         int[] data= {10,1,178,45,90};

         MergeSort sort= new MergeSort();
         System.out.println("before sorting-------------");
         sort.printArr(data);


         sort.sort(data);
         System.out.println("after sorting-------------");
         sort.printArr(data);



    }


    private void printArr(int[] data){
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

}
