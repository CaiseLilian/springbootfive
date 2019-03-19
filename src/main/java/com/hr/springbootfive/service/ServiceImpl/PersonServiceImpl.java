package com.hr.springbootfive.service.ServiceImpl;

import com.hr.springbootfive.dao.PersonMapper;
import com.hr.springbootfive.entity.Person;
import com.hr.springbootfive.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonMapper pm;

    @Override
    public void delete(Integer id) {
        pm.deleteByPrimaryKey(id);
    }

    @Override
    public List<Person> findAll() {
        return pm.selectAll();
    }

    @Override
    public void save(Person person) {
        pm.insert(person);
    }

    @Override
    public Person selectone(Integer id) {
        return pm.selectByPrimaryKey(id);
    }

    @Override
    public void update(Person person) {
        pm.updateByPrimaryKey(person);
    }
}
