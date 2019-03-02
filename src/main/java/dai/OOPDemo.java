package main.java.dai;

import main.java.dai.model.Student;
import main.java.dai.model.Class;
import main.java.dai.model.Teacher;

public class OOPDemo {
    public static void main(String[] args) {
        Class classOne = new Class(1);
        Class classTwo = new Class(2);
        Class classThree = new Class(3);
        Student studentA=new Student("张一",20,"01",classOne);
        Student studentB=new Student("张二",20,"02",classOne);
        Student studentC=new Student("张三",20,"03",classTwo);
        Student studentD=new Student("张四",20,"04",classTwo);
        Student studentE=new Student("张五",20,"04",classThree);
        Student studentF=new Student("张六",20,"04",classThree);
        Teacher teacherA = new Teacher("李一",29,"01", new int[]{1, 2});
        Teacher teacherB = new Teacher("李二",29,"02", new int[]{3});
        classOne.assignLeader(studentA,teacherA);
//        classOne.appendMember(studentE);
        classOne.assignLeader(studentE,teacherA);
        classThree.assignLeader(studentF,teacherB);
        System.out.println(classThree.getLeader());
        System.out.println(studentE.introduce());
    }
}
