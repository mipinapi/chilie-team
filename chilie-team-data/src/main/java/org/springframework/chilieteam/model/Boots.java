package org.springframework.chilieteam.model;


import lombok.Data;

import javax.persistence.*;


public class Boots extends BaseEntity {

    private String name;

    @ManyToOne
    private BootsProducer bootsProducer;

    public Boots() {
    }

    public Boots(String name) {
        this.name = name;
    }

}
