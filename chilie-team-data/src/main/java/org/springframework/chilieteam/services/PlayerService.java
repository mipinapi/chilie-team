package org.springframework.chilieteam.services;

import org.springframework.chilieteam.model.Player;

import java.util.Set;

public interface PlayerService extends CrudService<Player, Long> {

    Player findBySurname(String surname);


}
