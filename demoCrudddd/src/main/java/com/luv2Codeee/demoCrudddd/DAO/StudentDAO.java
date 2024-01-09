package com.luv2Codeee.demoCrudddd.DAO;

import com.luv2Codeee.demoCrudddd.entity.Student;

public interface StudentDAO {

    void save(Student student);

    Student find_By_id(Integer id);

    void update(Student student);

    void remove(Integer id);
}
