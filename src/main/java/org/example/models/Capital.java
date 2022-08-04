package org.example.models;

import javax.persistence.*;

@Entity
@Table(name = "CAPITAL")
public class Capital {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private boolean isMetropolitan;

    @OneToOne(mappedBy = "capital")
    private Country country;

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

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public boolean isMetropolitan() {
        return isMetropolitan;
    }

    public void setMetropolitan(boolean metropolitan) {
        isMetropolitan = metropolitan;
    }
}
