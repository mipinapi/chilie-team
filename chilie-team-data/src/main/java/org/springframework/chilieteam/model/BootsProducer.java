package org.springframework.chilieteam.model;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


public class BootsProducer extends BaseEntity {

    private String name; // Nike, Adidas, Puma

    @OneToMany
    private Set<Boots> boots = new HashSet<>();

    public BootsProducer() {
    }

    public BootsProducer(String name) {
        this.name = name;
    }

}
