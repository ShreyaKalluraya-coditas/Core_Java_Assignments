package org.example;

import javax.persistence.*;

@Entity
public class Animals {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String age;
    private String category;
    @ManyToOne
    private Zoo zoo;

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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Zoo getZoo() {
        return zoo;
    }

    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }

    public Animals(String name, String age, String category, Zoo zoo) {
        this.name = name;
        this.age = age;
        this.category = category;
        this.zoo = zoo;
    }

    public Animals(String name, String age, String category) {
        this.name = name;
        this.age = age;
        this.category = category;
    }
    public Animals(){

    }
    @Override
    public String toString() {
        return "Animals{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", category='" + category + '\'' +
//                ", zoo=" + zoo +
                '}';
    }
}
