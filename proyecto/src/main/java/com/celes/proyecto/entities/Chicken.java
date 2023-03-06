package com.celes.proyecto.entities;

import javax.persistence.*;

@Entity
public class Chicken {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private int age;
    @Column
    private boolean isEgg;

    @Column
    private long farmID;

    public Chicken() {
        super();
    }

    public Chicken(int age) {
        this.age = age;
        this.isEgg = age>2;
    }

    public int getAge() {
        return age;
    }

    public boolean isEgg() {
        return isEgg;
    }

    public long getId() {
        return id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEgg(boolean egg) {
        isEgg = egg;
    }
}
