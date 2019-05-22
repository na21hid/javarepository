package com.mycompany.repository;

import com.mycompany.model.Human;

public interface Repository {
     Human read(int id);
     void write(Human human);
     void printall();

}
