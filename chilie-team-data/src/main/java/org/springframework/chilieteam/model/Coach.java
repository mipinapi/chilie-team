package org.springframework.chilieteam.model;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Coach extends Person {

    @OneToMany
    @JoinColumn(name = "coach_id")
    private Set<Player> players = new HashSet<>();

    public Coach() {

    }

    public Coach(String name, String surname) {
        super();
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Coach coach = (Coach) o;
//        return Objects.equals(id, coach.id);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }
}
