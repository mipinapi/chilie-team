package org.springframework.chilieteam.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "statistics")
public class Statistics extends BaseEntity{

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "player_id")
    private Player player;

    @Column(name = "playedMatches")
    private Integer playedMatches;

    @Column(name = "goals")
    private Integer goals;

    @Column(name = "assists")
    private Integer assists;

    @Column(name = "yellowCards")
    private Integer yellowCards;

    @Column(name = "redCards")
    private Integer redCards;

}
