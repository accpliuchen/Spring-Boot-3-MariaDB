package com.example.repository;

import java.util.List;

import com.example.dto.Person;
import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public interface PersonRepository extends Repository<Person, Long> {

    @Transactional(propagation = Propagation.SUPPORTS)
    List<Person> findAll();

    Person save(Person person);

    void delete(Person person);

}
