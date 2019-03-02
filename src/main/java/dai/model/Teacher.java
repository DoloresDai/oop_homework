package main.java.dai.model;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Teacher extends Person {
    private int[] classes;

    public Teacher(String name, int age, String id,int[] classes) {
        super(name, age, id);
        this.classes=classes;
    }

    public int[] getClasses() {
        return classes;
    }

    public void setClasses(int[] classes) {
        this.classes = classes;
    }

    @Override
    public String introduce() {
        if (getClasses().length == 0) {
            return super.introduce() + "I am a Teacher. I teach No Class.";
        } else {
            return super.introduce() + "I am a Teacher. I teach Class " + Arrays.toString(classes);
        }
    }

    public boolean isTeaching(Class aclass,Student student) {
        return aclass.isIn(student,this);
        }
    }


