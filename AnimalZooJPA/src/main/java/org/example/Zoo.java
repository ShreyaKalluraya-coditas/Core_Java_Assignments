package org.example;

import javax.persistence.*;
import java.util.List;

@Entity
public class Zoo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String city;

    @OneToMany(mappedBy = "zoo" ,cascade = CascadeType.ALL)
    private List<Animals> animals;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Animals> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animals> animals) {
        this.animals = animals;
    }

    public Zoo(String name, String city, List<Animals> animals) {
        this.name = name;
        this.city = city;
        this.animals = animals;
    }
    public Zoo(){

    }


    @Override
    public String toString() {
        return "Zoo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", animals=" + animals +
                '}';
    }
}
