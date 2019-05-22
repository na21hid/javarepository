package com.mycompany.repository;

import com.mycompany.model.Human;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements Repository {


    private String fileName = "/home/amir/javarepository/src/main/resources/users.csv";

   private List<Human> humans = new ArrayList<>();

    @Override
    public Human read(int id) {

        for (int i = 0; i < humans.size() ; i++) {
            if(humans.get(i).getId() == id){
//                 Human human = humans.get(i);
//                 return  human;
               return humans.get(i);
            }
        }


        return null;
    }

    @Override
    public void write(Human human) {
        humans.add(human);
        }


    @Override
    public void printall() {
        for (int i = 0; i < humans.size() ; i++) {
            System.out.println( humans.get(i).toString());
        }
    }

}
