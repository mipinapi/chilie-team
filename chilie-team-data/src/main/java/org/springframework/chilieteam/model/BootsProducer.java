package org.springframework.chilieteam.model;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class BootsProducer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name; // Nike, Adidas, Puma

    @OneToMany
    private Set<Boots> boots = new HashSet<>();

    public BootsProducer() {
    }

    public BootsProducer(String name) {
        this.name = name;
    }

}
