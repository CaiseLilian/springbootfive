package com.hr.springbootfive.service;

import com.hr.springbootfive.entity.Person;

import java.util.List;

public interface PersonService {
    public  void  delete(Integer id);

    public List<Person> findAll();

    public void save(Person person);

    public Person selectone(Integer id);

    public void update(Person person);
}
