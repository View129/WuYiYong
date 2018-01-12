package sort;

public class Qkdemo {
    //private static String a = new String("ab");
    public static void main(String[] args) {
        System.out.print("Hello World");
        int[] a = new int[]{8,1,6,9,3,5};
        int start = 0;
        int end = a.length-1;
        sort(a,start,end);
        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }
        
    }
    public static void sort (int[] a,int s,int e) {
        int start = s;
        int end = e;
        int mark = a[s];
        int temp;

       while (start<end){
           while (start<end&&a[end]>=mark)
               end--;

           if(a[end]<mark){
               temp=a[start];
               a[start]=a[end];
               a[end]=temp;
           }
           while (start<end&&a[start]<=mark)
               start++;

           if(a[start]>mark){
               temp=a[start];
               a[start]=a[end];
               a[end]=temp;
           }
       }


        if(start>s){
            sort(a,s,start-1);
        }
        if(end<e){
            sort(a,end+1,e);
        }
    }


}
