package org.springframework.chilieteam.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "matches")
public class Match extends BaseEntity {

    @Column(name = "match_date")
    private LocalDate date;

    @Column(name = "description")
    private String description;

    @ManyToMany
    @JoinTable(name = "match_player", joinColumns = @JoinColumn(name = "match_id"),
                inverseJoinColumns = @JoinColumn(name = "player_id"))
    private Set<Player> players = new HashSet<>();
}
