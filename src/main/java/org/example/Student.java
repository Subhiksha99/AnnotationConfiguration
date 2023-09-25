package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
    private int rollNo;
    private String name;
    private String dept;
    private int passedOutYear;
    @Autowired
    Address address;
    Student(){}
    public Student(int rollNo)
    {
        this.rollNo=rollNo;
    }
    public Student(int rollNo, String name, String dept, int passedOutYear,Address address) {
        this.rollNo = rollNo;
        this.name = name;
        this.dept = dept;
        this.passedOutYear = passedOutYear;
        this.address=address;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getPassedOutYear() {
        return passedOutYear;
    }

    public void setPassedOutYear(int passedOutYear) {
        this.passedOutYear = passedOutYear;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", passedOutYear=" + passedOutYear +
                ", address=" + address +
                '}';
    }
}
