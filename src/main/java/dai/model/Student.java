package main.java.dai.model;

public  class Student extends Person {
    private Class aClass;

    public Student(String name, int age, String id,Class aClass) {
        super(name, age, id);
        this.aClass=aClass;
    }

    public void setaClass(Class aClass){
        this.aClass = aClass;
    }

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
