package com.celes.proyecto.entities;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
public class Farm {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private int chickenCapacity;

    @Column
    private ArrayList<Chicken> chickens;

    public Farm() {
        super();
    }

    public Farm(long id, int chickenCapacity, ArrayList<Chicken> chickens) {
        this.chickenCapacity = chickenCapacity;
    }

    public long getId() {
        return id;
    }

    public int getChickenCapacity() {
        return chickenCapacity;
    }

    public ArrayList<Chicken> getChickens() {
        return chickens;
    }

    public void setChickenCapacity(int chickenCapacity) {
        this.chickenCapacity = chickenCapacity;
    }

    public void setChickens(ArrayList<Chicken> chickens) {
        this.chickens = chickens;
    }

}
