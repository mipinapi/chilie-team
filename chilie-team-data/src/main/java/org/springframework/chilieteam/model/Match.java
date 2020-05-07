package org.springframework.chilieteam.model;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Match extends BaseEntity {

    private LocalDate date;
    private String description;

    @ManyToMany
    @JoinTable(name = "match_player", joinColumns = @JoinColumn(name = "match_id"),
                inverseJoinColumns = @JoinColumn(name = "player_id"))
    private Set<Player> players = new HashSet<>();
}
