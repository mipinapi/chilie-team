package org.springframework.chilieteam.model;


import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


public class Player extends Person {

    @ManyToMany(mappedBy = "players")
    private Set<Team> teams = new HashSet<>();

    @ManyToOne
    private Coach coach;

    public Player() {

    }

    public Player(String name, String surname) {
        super();
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Player player = (Player) o;
//        return Objects.equals(id, player.id);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }
}
