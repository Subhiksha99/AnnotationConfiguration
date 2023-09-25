package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Student s1=(Student)context.getBean("student",Student.class);
        System.out.println(s1);
        s1.setName("subhiksha");
        s1.setRollNo(99);
        s1.setDept("IT");
        s1.setPassedOutYear(2023);

        Address addr=(Address)context.getBean("address",Address.class);
        addr.setDoorNo(3);
        addr.setCity("chennai");
        addr.setStreet("KGF street");

        s1.setAddress(addr);

        System.out.println(s1);

    }
}