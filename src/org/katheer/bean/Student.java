package org.katheer.bean;

public class Student {
    private String name;
    private String regNo;
    private Address address;

    public Student(String name, Address address, String regNo) {
        this.name = name;
        this.regNo = regNo;
        this.address = address;
    }

    public void showStudentInfo() {
        System.out.println("*************************************************");
        System.out.println("Name    : " + this.name);
        System.out.println("Reg No  : " + this.regNo);
        System.out.println("Address : \n" + address.getAddress());
        System.out.println("*************************************************");
    }
}
