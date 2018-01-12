package com.wyy;

import java.util.Comparator;

/**
 * 快速排序
 */
public class QkSort {

    public static void qkSrot(Object[] a, int s, int e, Comparator comparator) {  //快速排序算法
        int start = s;        //左指针
        int end = e;          //右指针
        Object mark = a[s];     //确定快速排序的中间值 key
        Object temp;            // 数据两两交换的临时变量

        while (start < end) {
            while (start < end && (comparator.compare(a[end], mark) == 1 || comparator.compare(a[end], mark) == 0)) //调用重写的sort方法判断大小
                end--;

            if (comparator.compare(a[end], mark) == -1) {  //两两交换
                temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
            while (start < end && (comparator.compare(a[start], mark) == -1 || comparator.compare(a[start], mark) == 0))//调用重写的sort方法判断大小
                start++;

            if (comparator.compare(a[start], mark) == 1) {  //两两交换
                temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }

        }
        print(a);
        if (start > s) {
            qkSrot(a, s, start - 1, comparator);  //递归  左半边再进行快速排序
        }
        if (end < e) {
            qkSrot(a, end + 1, e, comparator);  //递归  右半边再进行快速排序
        }
    }

    /**
     * 归并排序
     */
    public static void mergeSort(Object[] data,Comparator comparator) {
        sort(data, 0, data.length - 1, comparator);
    }

    public static void sort(Object[] data, int left, int right,Comparator comparator) {
        if (left >= right)
            return;
        // 找出中间索引
        int center = (left + right) / 2;
        // 对左边数组进行递归
        sort(data, left, center, comparator);
        // 对右边数组进行递归
        sort(data, center + 1, right, comparator);
        // 合并
        merge(data, left, center, right, comparator);
        print(data);
    }

    public static void merge(Object[] data, int left, int center, int right,Comparator comparator) {
        // 临时数组
        Object[] tmpArr = new Object[data.length];
        // 右数组第一个元素索引
        int mid = center + 1;
        // third 记录临时数组的索引
        int third = left;
        // 缓存左数组第一个元素的索引
        int tmp = left;
        while (left <= center && mid <= right) {
            // 从两个数组中取出最小的放入临时数组
            if (comparator.compare(data[left],data[mid])==-1||comparator.compare(data[left],data[mid])==0) {
                tmpArr[third++] = data[left++];
            } else {
                tmpArr[third++] = data[mid++];
            }
        }
        // 剩余部分依次放入临时数组（实际上两个while只会执行其中一个）
        while (mid <= right) {
            tmpArr[third++] = data[mid++];
        }
        while (left <= center) {
            tmpArr[third++] = data[left++];
        }
        // 将临时数组中的内容拷贝回原数组中
        // （原left-right范围的内容被复制回原数组）
        while (tmp <= right) {
            data[tmp] = tmpArr[tmp++];
        }
    }

    public static void print(Object[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }
        System.out.println();
    }
}
