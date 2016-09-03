package com.samples.springhiber.integration;

import com.samples.springhibernate.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by edara on 9/2/16.
 */
@Component
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class ServiceEx1 {

    @Autowired
    Dao dao;

    public void lookupPerson(){
        Person person = dao.getPerson(1);
        if(person != null)
            System.out.println(person);

    }

}
