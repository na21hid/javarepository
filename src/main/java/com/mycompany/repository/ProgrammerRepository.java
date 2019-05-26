package com.mycompany.repository;

import com.mycompany.model.Human;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ProgrammerRepository implements Repository {

   private HashMap<Integer,Human > programmersMap = new HashMap<Integer, Human>();


    @Override
    public Human read(int id) {
       return programmersMap.get(id);

    }

    @Override
    public void write(Human human) {
    programmersMap.put(human.getId(),human);

    }

    @Override
    public void printall() {
        System.out.println(programmersMap.size());
        Iterator iterator = programmersMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry pair = (Map.Entry) iterator.next();
            System.out.println( pair.getValue().toString());
        }
    }
}
