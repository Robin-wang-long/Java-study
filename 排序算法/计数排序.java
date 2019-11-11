package study;

import java.util.Arrays;

public class 计数排序 {
    public static void main(String[] args) {
           int a[] = {2,34,49,3,12,14,24,34};
           int b[] = countSort(a);
           System.out.println(Arrays.toString(b));
    }
    public static int[] countSort(int[] a) {
        int[] b = new int[a.length];
        int max = a[0], min = a[0];
        for (int i : a) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        // 根据 a 中的最大值与最小值，求出辅助数组的最小长度
        int[] c = new int[max - min + 1];
        for (int i1 : a) {
            c[i1 - min] += 1;
        }

        // 进行一次累加操作之后，
        // 那么对于存在数个相等的元素 a[x]（假设为 a[x]_1，a[x]_2，...a[x]_last，
        //  其中 a[x]_last 为最后一个 a[x]，即在 a 中处于最右边位置的 a[x]）
        // 则在排序后，有 (c[i] - 1) 即为 a[x]_last 前面存在的元素个数。
        // 这样是保证排序结果稳定的前提
        for (int i = 1; i < c.length; ++i) {
            c[i] = c[i] + c[i - 1];
        }

        // 倒着遍历 a，则可以先遍历到 a[x]_last，从而根据 c[y] 的值来确定其稳定的位置
        for (int i = a.length - 1; i >= 0; --i) {
            int pos = a[i] - min;// pos 为 a[i] 映射到 c 中的下标
            int sumCount = c[pos];
            b[sumCount - 1] = a[i];
            --c[pos];
        }

        return b;
    }

}
