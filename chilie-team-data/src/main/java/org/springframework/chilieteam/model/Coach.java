package org.springframework.chilieteam.model;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Data
@Entity
@Table(name = "coaches")
public class Coach extends Person {

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "coaches_styles", joinColumns = @JoinColumn(name = "coach_id"),
                inverseJoinColumns = @JoinColumn(name = "style_id"))
    private Set<FootballStyle> footballStyles = new HashSet<>();

    @OneToMany(mappedBy = "coach")
    private Set<Player> players = new HashSet<>();

    public Coach() {

    }

    public Coach(String name, String surname) {
        super();
    }


}
