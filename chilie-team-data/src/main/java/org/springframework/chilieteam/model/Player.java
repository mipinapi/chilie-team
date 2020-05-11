package org.springframework.chilieteam.model;


import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "players")
public class Player extends Person {


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
