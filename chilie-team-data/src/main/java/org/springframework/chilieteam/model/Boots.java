package org.springframework.chilieteam.model;


import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "boots")
public class Boots extends BaseEntity {

    @Column(name = "name")
    private String name;

}
