package sort;

import wuyiyong.People;

public class Student extends People implements SortInterface {
    private int age;
    //构造函数
    public Student(){}
    public Student(int age){
        this.age=age;
    }

    public int getAge(){  //返回age
        return age;
    }
    @Override
    public void say() {
        System.out.println("我是学生！");
    }

    @Override
    //重写排序规则
    public Boolean sort(Object obj) {
        if(this.age>((Student)obj).getAge()){
            return true;
        }else {
            return false;
        }
    }




    public static void main(String[] args) {

        //定义Student对象数组
        Student[] s = new Student[10];
        int[] a = {12,20,5,16,15,12,30,12,23,9};
        for (int i = 0; i < a.length; i++) {
            s[i] = new Student(a[i]);
        }
        //调用排序算法
        int start = 0;
        int end = s.length-1;
        QkSort.sortt(s,start,end);
        //输出排序后的结果
        for(int i = 0; i<s.length; i++){
            System.out.println(s[i].getAge());
        }
    }
}
