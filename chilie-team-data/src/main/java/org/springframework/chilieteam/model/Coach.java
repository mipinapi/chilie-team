package org.springframework.chilieteam.model;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Data
public class Coach extends Person {

    private Set<FootballStyle> footballStyles = new HashSet<>();

    @OneToMany
    @JoinColumn(name = "coach_id")
    private Set<Player> players = new HashSet<>();

    public Coach() {

    }

    public Coach(String name, String surname) {
        super();
    }


}
