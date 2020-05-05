package org.springframework.chilieteam.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class Statistics extends BaseEntity{

    @OneToOne
    private Player player;

    private Integer playedMatches;
    private Integer goals;
    private Integer assists;
    private Integer yellowCards;
    private Integer redCards;

}
