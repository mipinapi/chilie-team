package org.springframework.chilieteam.model;


import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


public class Team extends BaseEntity {

    private String name;

    private Place place;

    @ManyToMany
    @JoinTable(name = "team_player", joinColumns = @JoinColumn(name = "team_id"),
                inverseJoinColumns = @JoinColumn(name = "player_id"))
    private Set<Player> players = new HashSet<>();

    public Team() {

    }

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }
}
