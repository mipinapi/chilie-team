package org.springframework.chilieteam.repositories;

import org.springframework.chilieteam.model.Player;
import org.springframework.data.repository.CrudRepository;


public interface PlayerRepository extends CrudRepository<Player, Long> {

    Player findBySurname(String surname);
}
