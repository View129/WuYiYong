package com.wyy;

public class TestString {
    public static void main(String[] args) {
        //定义Student对象数组
        String[] s = {"33","22","55","54","66","14","33","77","33","41"};
        //System.out.println(s[0].compareTo(s[3]));
        //调用排序算法
        int start = 0;
        int end = s.length-1;
        //快速排序
       // QkSort.qkSrot(s,start,end,new StringComparator());
        //归并排序
        QkSort.mergeSort(s,new StringComparator());
        //输出排序后的结果
        System.out.println("排序后为：");
        for(int i = 0; i<s.length; i++){
            System.out.print(s[i]+"\t");
        }
    }

}
