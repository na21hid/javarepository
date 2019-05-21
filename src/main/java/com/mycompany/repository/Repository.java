package com.mycompany.repository;

import com.mycompany.model.Human;

public interface Repository {
     Human read(Human human);
     void write(Human human);
     void printall(Human human);

}
