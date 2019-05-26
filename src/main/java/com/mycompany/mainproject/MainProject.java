package com.mycompany.mainproject;

import com.mycompany.model.Programer;
import com.mycompany.model.Student;
import com.mycompany.model.Teacher;
import com.mycompany.repository.ProgrammerRepository;
import com.mycompany.repository.Repository;
import com.mycompany.repository.StudentRepository;
import com.mycompany.repository.TeacherRepository;
import utilities.CSV;

import java.util.List;

public class MainProject {
    public static void main(String[] args) {

        String fileName = "/home/amir/javarepository/src/main/resources/users.csv";


        Repository studentRepository = new StudentRepository();


        Repository teacherRepository = new TeacherRepository();
        Repository programmerRepository = new ProgrammerRepository();



        //read a CSV file then create new  on that data

        List<String[]> newHolder = CSV.read(fileName);
        for (String[] holder : newHolder) {

            int id = Integer.valueOf(holder[0]);
            String type = holder[1];
            int age = Integer.valueOf(holder[2]);
            String sex = holder[3];
            double salary = Double.parseDouble(holder[4]);
            System.out.println(id + " " + type + " " + age + " "+ sex + " "+ salary);

            if ("S".equals(type)){
                System.out.println("Student");
                studentRepository.write(new Student(id,age,sex,salary));
            } //TODO:impliment else if
            else if("T".equals(type)){
                System.out.println("Teacher");
                teacherRepository.write((new Teacher(id,age,sex,salary)));
            }
            else if("P".equals(type)){
                System.out.println("programmer");
                programmerRepository.write(new Programer(id,age,sex,salary));
            }else{
                System.out.println("no exist");
            }


        }
        studentRepository.printall();
        System.out.println(studentRepository.read(7).toString());

        teacherRepository.printall();

        programmerRepository.printall();
        System.out.println(programmerRepository.read(9));


    }


}
