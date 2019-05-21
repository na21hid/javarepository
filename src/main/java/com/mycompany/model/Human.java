package com.mycompany.model;


public class Human {
   private int id ;
   private int age;
   private String sex;
   private double salary;


    public Human() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void showInfo(){
        System.out.println("Id: " + id + "\nAge: " + age +
                "\nSex: "+ sex +  "\n Salary "+ salary + "%");
    }
}
