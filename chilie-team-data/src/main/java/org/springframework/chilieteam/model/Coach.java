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
@Table(name = "coaches")
public class Coach extends Person {

    @Builder
    public Coach(Long id, String name, String surname, Set<FootballStyle> footballStyles, Set<Player> players) {
        super(id, name, surname);
        this.footballStyles = footballStyles;
        this.players = players;
    }
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "coaches_styles", joinColumns = @JoinColumn(name = "coach_id"),
                inverseJoinColumns = @JoinColumn(name = "style_id"))
    private Set<FootballStyle> footballStyles = new HashSet<>();

    @OneToMany(mappedBy = "coach")
    private Set<Player> players = new HashSet<>();

}
