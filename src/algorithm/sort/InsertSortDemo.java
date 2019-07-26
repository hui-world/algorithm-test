package algorithm.sort;

import java.util.Arrays;

public class InsertSortDemo {
    public static void insertSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int index = i;
            for (int j = i - 1; j > -1; j--) {
                if (arr[index] < arr[j]){
                    swap(arr,index,j);
                    index --;
                }else{
                    break;
                }
            }
        }
    }

    private static void swap(int[] arr, int index, int i) {
        int temp = arr[index];
        arr[index] = arr[i];
        arr[i] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5,8,2,546,23,67,2,34,-23,-54,0,45,45,67};
        insertSort(arr);
        System.out.println("INSERT SORT : " + Arrays.toString(arr));
    }
}
