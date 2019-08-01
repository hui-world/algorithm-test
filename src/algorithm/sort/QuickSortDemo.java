package algorithm.sort;

import java.util.Arrays;

/**
 * 快速排序
 * 思路: 取一个数将小的放在左侧, 大的放右侧,通过递归 将该分界点的 数据 依次处理  直至,为一个元素
 * 复杂度: 时间复杂度 O(logn) 空间复杂度 O (1)
 * 稳定性 : 稳定
 */
public class QuickSortDemo {

    public static void quickSort(int[] arr , int start , int end){
        if(start >= end){
            return;
        }
        // 获取分区索引值
        int index = partition(arr ,start ,end);

        // 根据索引继续排序左右两区的数组
        quickSort(arr , start , index - 1);
        quickSort(arr , index + 1 , end);

    }

    private static int partition(int[] arr, int start, int end) {
        // 最后一个元素
        int value = arr[end];
        int j = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] <= value && i == j){
                j ++;
            }else if(arr[i] <= value && i > j){
                swap(arr , i , j);
                j ++;
            }
        }
        return j -1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5,8,2,546,23,67,2,34,-23,-54,0,45,45,67};
        quickSort(arr,0,arr.length - 1);
        System.out.println("Quick SORT : " + Arrays.toString(arr));
    }
}
