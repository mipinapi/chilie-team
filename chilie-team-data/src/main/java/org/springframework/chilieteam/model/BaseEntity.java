package org.springframework.chilieteam.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 *
 Аннотация @MappedSuperclass позволяет реализовать наследование Entity классов только в модели предметной области без
 отражения ее в схеме базы данных. @MappedSuperclass определяет класс - предок для Entity классов, описанные и
 аннотированные свойства и методы которого будут применены в классах-наследниках. Описанный супер класс не отображается
 на отдельную таблицу.
 */

@MappedSuperclass
public class BaseEntity implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
