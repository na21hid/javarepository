package com.mycompany.repository;

import com.mycompany.model.Human;

import java.util.LinkedList;
import java.util.List;

public class TeacherRepository implements Repository {

    private String fileName = "/home/amir/javarepository/src/main/resources/users.csv";
    List<Human> humans = new LinkedList<Human>();



    @Override
    public Human read(int id) {
        for (int i = 0; i < humans.size() ; i++) {
            if (humans.get(id).getId() == id){
                return humans.get(id);
            }
        }
        return null;
    }

    @Override
        public void write (Human human){
            humans.add(human);
        }

        @Override
        public void printall (){
            for (int i = 0; i <humans.size() ; i++) {
                System.out.println(humans.get(i).toString());
            }
        }

    }
