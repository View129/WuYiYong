package arraylist;

import java.lang.reflect.Array;

public class MyArrayList<E> {
    private int leng=10;
    private int size=0;
    private E first;
    private E[] data;

    private MyArrayList() {}
    private MyArrayList(int leng) {
        this.leng=leng;
    }
    //扩容
    private void newData(int leng){
        E[] copy = newArray(first,leng);//反射new
        System.arraycopy(data, 0, copy, 0, Math.min(data.length, leng));
        data=copy;
        this.leng=leng;
       // System.out.println("扩容成功");
    }

    public E get(int i) throws Exception {
        if (i>=size){
            throw new ArrayIndexOutOfBoundsException("数组下标越界");
        }
        return  data[i]; //没有强转了
    }

    public void set(int i,E d){
        data[i]=d;
    }

    public void add(E d){
        //第一次添加new数组
        if(size==0){
            first=d;
            data=newArray(d,leng);
        }
        dataCheck(size+1);
        data[size++]=d;
    }
    //检查是否该扩容了
    private void dataCheck(int s){
        if(s>=leng){
            newData(leng*3);
        }
    }
    //反射new数组
    private E[] newArray(E d, int len){
        Class clazz = d.getClass();
        E[] arr= (E[]) Array.newInstance(clazz,len);//这个强转搞不定
        return arr;
    }


    public static void main(String[] args) throws Exception {
        MyArrayList<String> a=new MyArrayList<>(2);
        a.add("string");
        a.add("3");
        a.add("3");
        a.add("3");
        a.set(1,"2");
        for (int i = 0; i <4; i++) {
            System.out.println(a.get(i));
        }
    }
}
