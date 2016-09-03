package com.samples.springhibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by edara on 9/2/16.
 */
@Entity(name = "vehicle")
public class Vehicle {
    @Id
    @Column(name = "vehicle_regno")
    private String v_regno;
    @Column
    private int owner_ssn;
    @Column(name = "vehicle_type")
    private String v_type;
    @Column(name="vehicle_make")
    private String v_make;

    public int getOwner_ssn() {
        return owner_ssn;
    }

    public void setOwner_ssn(int owner_ssn) {
        this.owner_ssn = owner_ssn;
    }

    public String getV_type() {
        return v_type;
    }

    public void setV_type(String v_type) {
        this.v_type = v_type;
    }

    public String getV_make() {
        return v_make;
    }

    public void setV_make(String v_make) {
        this.v_make = v_make;
    }

    public String getV_reg_no() {
        return v_regno;
    }

    public void setV_reg_no(String v_reg_no) {
        this.v_regno = v_reg_no;
    }
}
