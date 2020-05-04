package org.springframework.chilieteam.model;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Data
@Entity
public class Coach {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String surname;

    @OneToMany
    @JoinColumn(name = "coach_id")
    private Set<Player> players = new HashSet<>();

    public Coach() {

    }

    public Coach(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coach coach = (Coach) o;
        return Objects.equals(id, coach.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
