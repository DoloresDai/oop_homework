package main.java.dai.model;

public abstract class Student extends Person {
    private String name;
    private int age;
    private String id;
    private Class aClass;

    public Student(String name) {
        super(name);
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public Student(String name, int age, String id, Class aClass) {
        super(name, age, id);
        setClass(aClass);
    }

    public abstract void setClass(Class aClass);

    public int getaClass() {
        return this.aClass.getNumber();
    }

    @Override
    public String introduce() {
        if (this.aClass.getLeader().equals(this.name)) {
            return super.introduce()+"I am Leader of Class"+this.aClass.getNumber()+".";
        } else {
            return super.introduce();
        }
    }
}
