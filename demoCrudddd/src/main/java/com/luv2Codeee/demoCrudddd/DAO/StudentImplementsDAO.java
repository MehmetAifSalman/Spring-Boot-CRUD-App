package com.luv2Codeee.demoCrudddd.DAO;

import com.luv2Codeee.demoCrudddd.entity.Student;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class StudentImplementsDAO implements StudentDAO{

    //define field for entity maneger
    private EntityManager entityManager;



    //inject entity maneger using constructer injection
    @Autowired
    public StudentImplementsDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    //Implement save method

    @Override
    @Transactional
    public void save(Student student) {
        entityManager.persist(student);
    }


    // Implement read method with "id" info.
    @Override
    public Student find_By_id(Integer id) {
      return  entityManager.find(Student.class , id);
    }


    // Implement the upload method
    @Override
    @Transactional
    public void update(Student student) {
        entityManager.merge(student);
    }

    @Override
    @Transactional
    public void remove(Integer id) {
        Student student = entityManager.find(Student.class,id);
        entityManager.remove(student);
    }
}
