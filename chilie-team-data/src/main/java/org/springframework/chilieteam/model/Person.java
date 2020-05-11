package org.springframework.chilieteam.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class Person extends BaseEntity {

    public Person(Long id, String name, String surname) {
        super(id);
        this.name = name;
        this.surname = surname;
    }

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

}
