package org.launchcode.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Menu {
    @NotNull
    @Size(min=3, max=15, message="Name must be between 3 and 15 characters.")
    private String name;

    @Id
    @GeneratedValue
    private int id;

    @ManyToMany
    List<Cheese> cheeses;

    public void addItem(Cheese item) {
        cheeses.add(item);
    }

    //Constructors
    public Menu() { }

    public Menu(String name) {
        this.name = name;
    }

    //Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Cheese> getCheeses() {
        return cheeses;
    }

}


