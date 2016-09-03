package com.samples.springhibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by edara on 9/2/16.
 */
@Entity(name = "person" )
public class Person {
    @Id
    private int ssn;
    @Column(name = "firstname")
    private String firstName;
    @Column(name="lastname")
    private String lastName;

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstname) {
        this.firstName = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastname) {
        this.lastName = lastName;
    }
    public String toString() {
        return "SSN : "+ssn+"   "+"FirstName: "+firstName+"    "+"LastName: "+lastName;
    }
}
