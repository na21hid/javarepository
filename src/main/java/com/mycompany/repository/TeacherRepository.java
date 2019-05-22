package com.mycompany.repository;

import com.mycompany.model.Human;

import java.util.LinkedList;
import java.util.List;

public class TeacherRepository implements Repository {

    private String fileName = "/home/amir/javarepository/src/main/resources/users.csv";
    List<Human> humans = new LinkedList<Human>();



    @Override
    public Human read(int id) {
        return null;
    }

    @Override
        public void write (Human human){

        }

        @Override
        public void printall (){

        }

    }
