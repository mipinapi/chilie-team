package org.springframework.chilieteam.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "boots")
public class Boots extends BaseEntity {

    @Column(name = "name")
    private String name;

    public Boots() {
    }

    public Boots(String name) {
        this.name = name;
    }

}
