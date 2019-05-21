package com.mycompany.mainproject;

import com.mycompany.model.Human;
import com.mycompany.model.Programer;
import com.mycompany.model.Student;
import com.mycompany.model.Teacher;
import utilities.CSV;


import java.util.LinkedList;
import java.util.List;

public class MainProject {
    public static void main(String[] args) {

        List<Human> humans = new LinkedList<Human>();

        String fileName = "/home/amir/javarepository/src/main/resources/users.csv";


        //read a CSV file then create new  on that data

        List<String[]> newHolder = CSV.read(fileName);
        for (String[] holder : newHolder) {
            System.out.println(holder[0]);
            System.out.println(holder[1]);
            System.out.println(holder[2]);
            System.out.println(holder[3]);
            System.out.println(holder[4]);

            String Id = holder[0];
            String type = holder[1];
            String age = holder[2];
            String sex = holder[3];
            double salary = Double.parseDouble(holder[4]);
            System.out.println(Id + " " + type + " " + age + " "+ sex + " "+ salary);

            if ("S".equals(type)){
                System.out.println("Open Student");
                humans.add(new Student(Id,age,sex,salary));
            }
            else if (type.equals("T")) {
                System.out.println("open Teacher");
                humans.add(new Teacher(Id,age,sex,salary));
            }
             else if (type.equals("P")){
                System.out.println("open Programmer");
                humans.add(new Programer(Id,age,sex,salary));

            }else {
                System.out.println(" ERROR reading type");
            }
        }

        for (Human human : humans){
            System.out.println("\n *********************");
            human.showInfo();
        }


    }
}
