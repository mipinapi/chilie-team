package org.springframework.chilieteam.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 *
 Аннотация @MappedSuperclass позволяет реализовать наследование Entity классов только в модели предметной области без
 отражения ее в схеме базы данных. @MappedSuperclass определяет класс - предок для Entity классов, описанные и
 аннотированные свойства и методы которого будут применены в классах-наследниках. Описанный супер класс не отображается
 на отдельную таблицу.
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
