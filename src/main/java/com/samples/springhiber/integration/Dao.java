package com.samples.springhiber.integration;

import com.samples.springhibernate.model.Person;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by edara on 9/2/16.
 */
@Repository
public class Dao {
    @Autowired
    SessionFactory sessionFactory;

    Person getPerson(int ssn){
        Session session = sessionFactory.getCurrentSession();
        Person person = session.get(Person.class,ssn);
        return person != null ? person :null;

    }
}
