package org.springframework.chilieteam.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
public class Statistics {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private Player player;

    private Integer playedMatches;
    private Integer goals;
    private Integer assists;
    private Integer yellowCards;
    private Integer redCards;

}
