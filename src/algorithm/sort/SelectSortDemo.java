package algorithm.sort;

import java.util.Arrays;

/**
 * 选择排序
 * 思路: 第一轮 找出0 ~ (length - 1)最小元素, 并与 index = 0 位置元素 swap ; 第二轮 找出 1 ~(length - 1)最小元素并与 index = 1 位置元素 swap
 *      第 length - 1 轮 找出 (length - 2) ~(length - 1) 最小元素,并与 index = length - 2 位置元素 swap
 * 复杂度: 时间复杂度O (n^ 2) 空间复杂度O(1)
 * 稳定性: 不稳定
 */
public class SelectSortDemo {
    
    public static void selectSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            swap(arr , i , minIndex);
        }
    }

    private static void swap(int[] arr, int i, int minIndex) {
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5,8,23,546,23,67,2,34,-23,-54,0,45,45,67};
        selectSort(arr);
        System.out.println("SELECT SORT : " + Arrays.toString(arr));
    }
}
