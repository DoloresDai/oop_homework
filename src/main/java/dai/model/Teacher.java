package main.java.dai.model;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Teacher extends Person {
    private String name;
    private int age;
    private String id;
    private int[] classess;

    public Teacher(String name) {
        super(name);
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, String id) {
        super(name, age, id);
    }

    public Teacher(String name, int age, String id, int[] classess) {
        super(name, age, id);
        this.classess = classess;
    }

    public int[] getClassess() {
        return classess;
    }

    public void setClassess(int[] classess) {
        this.classess = classess;
    }

    @Override
    public String introduce() {
        if (getClassess().length == 0) {
            return super.introduce() + "I am a Teacher. I teach No Class.";
        } else {
            return super.introduce() + "I am a Teacher. I teach Class " + Arrays.toString(classess);
        }
    }

    public boolean isTeaching(Student student) {
//           System.out.println(IntStream.range(0, classess.length).filter(i -> student.getClass().equals(i)));
        for (int elements : classess) {
            if (elements == (student.getaClass())) {
                return true;
            } else return false;
        }
    }
}

