package wuyiyong;

import sort.Student;

public class Report {
    public void interView(People p){
        System.out.println("请说出你的职业：");
        p.say();
    }
    public static void main(String[] args) {
        Report r = new Report();
        r.interView(new Student());
        r.interView(new Teacher());
        r.interView(new Doctor());
    }
}
