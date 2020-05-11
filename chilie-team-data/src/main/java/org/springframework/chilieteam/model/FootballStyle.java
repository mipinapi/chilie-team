package org.springframework.chilieteam.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "styles")
public class FootballStyle extends BaseEntity {

    @Column(name = "description")
    private String description;

}
