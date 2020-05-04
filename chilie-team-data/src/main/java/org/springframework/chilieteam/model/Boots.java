package org.springframework.chilieteam.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Boots {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @ManyToOne
    private BootsProducer bootsProducer;

    public Boots() {
    }

    public Boots(String name) {
        this.name = name;
    }

}
