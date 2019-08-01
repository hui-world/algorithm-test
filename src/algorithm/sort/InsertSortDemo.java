package algorithm.sort;

import java.util.Arrays;

/**
 * 插入排序
 * 思路: 第一轮, 取 index = 1 的元素, 依次与 index < 2的元素进行,如果小于前面的元素 ,则交换位置, 直志该元素大于前面的元素, 结束比较
 *      ...
 *      弟 n - 1轮 , 取 index = n -1 位置 ,重复上述步骤
 * 复杂度: 时间复杂度 O(n^2) 空间复杂度 O (1)
 * 稳定性: 稳定
 */
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
