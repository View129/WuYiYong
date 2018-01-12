package sort;

public  class QkSort {

    public static void sortt(SortInterface[] a, int s, int e) {  //快速排序算法
        int start = s;        //左指针
        int end = e;          //右指针
        SortInterface mark = a[s];     //确定快速排序的中间值 key
        SortInterface temp;            // 数据两两交换的临时变量

        while (start<end) {
            while (start < end && a[end].sort(mark))  //调用重写的sort方法判断大小
                end--;

            if (!a[end].sort(mark)) {  //两两交换
                temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
            while (start < end && !a[start].sort(mark))//调用重写的sort方法判断大小
                start++;

            if (a[start].sort(mark)) {  //两两交换
                temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }

        }
            if (start > s) {
                sortt(a, s, start - 1);  //递归  左半边再进行快速排序
            }
            if (end < e) {
                sortt(a, end + 1, e);  //递归  右半边再进行快速排序
            }

    }



}