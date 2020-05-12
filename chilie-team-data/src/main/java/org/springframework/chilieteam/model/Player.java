package org.springframework.chilieteam.model;


import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "players")
public class Player extends Person {

    @Builder
    public Player(Long id, String name, String surname, String country, Set<Team> teams, Coach coach, Boots boots, Set<Match> matches) {
        super(id, name, surname);
        this.country = country;
        this.teams = teams;
        this.coach = coach;
        this.boots = boots;
        this.matches = matches;
    }

    @Column(name = "country")
    private String country;

    @ManyToMany(mappedBy = "players")
    private Set<Team> teams = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "coach_id")
    private Coach coach;

    @ManyToOne
    @JoinColumn(name = "boots_id")
    private Boots boots;

    @ManyToMany(mappedBy = "players")
    private Set<Match> matches = new HashSet<>();

}
