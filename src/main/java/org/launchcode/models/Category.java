package org.launchcode.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Category {
    @Id
    @GeneratedValue
    private int id;

    @OneToMany
    @JoinColumn(name="category_id")
    private List<Cheese> cheeses = new ArrayList<>();

    @NotNull
    @Size(min=3, max=15, message="Category Name must be between 3 and 15 characters.")
    private String name;


    //Constructors

    public Category() { } //Default Const

    public Category(String name) {
        this();
        this.name = name;
    }

    //Getters & Setters

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


}
