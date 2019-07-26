package algorithm.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 * 思路 : 第一轮找最大元素, 并放置 index = length-1   第二轮找到第二大元素 ,放置在 index = length -2   ... 第 找到 第二小元素 ,放置在 index = 2 的位置
 * 复杂度: 时间复杂度 O (n 平方) , 空间复杂度 O(1)
 * 稳定性: 稳定
 */
public class BubbleSortDemo {

    public static void bubbleSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i + 1; j++) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j - 1, j);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5,8,23,546,23,67,2,34,-23,-54,0,45,45,67};
        bubbleSort(arr);
        System.out.println("BUBBLE SORT : " + Arrays.toString(arr));
    }
}
