package main.java.dai.model;

public class Class {
    private int number;
    private String leader;

    public Class(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public void assignLeader(Student student) {
        if (this.getNumber() == student.getaClass()) {
            this.leader=student.getName();
        } else {
            System.out.println("It is not one of us.");
        }
    }


    public void appendMember(Student student) {
        student.setClass(this);
    }
    public void isIn(Student student,Teacher teacher){
        if()
    }
}
