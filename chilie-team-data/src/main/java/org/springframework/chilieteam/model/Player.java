package org.springframework.chilieteam.model;


import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


public class Player extends Person {

    private String country;

    @ManyToMany(mappedBy = "players")
    private Set<Team> teams = new HashSet<>();

    @ManyToOne
    private Coach coach;

    private Boots boots;

    @ManyToMany(mappedBy = "players")
    private Set<Match> matches = new HashSet<>();

    public Player() {

    }

    public Player(String name, String surname) {
        super();
    }

    public Set<Team> getTeams() {
        return teams;
    }

    public void setTeams(Set<Team> teams) {
        this.teams = teams;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public Boots getBoots() {
        return boots;
    }

    public void setBoots(Boots boots) {
        this.boots = boots;
    }

    public Set<Match> getMatches() {
        return matches;
    }

    public void setMatches(Set<Match> matches) {
        this.matches = matches;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
