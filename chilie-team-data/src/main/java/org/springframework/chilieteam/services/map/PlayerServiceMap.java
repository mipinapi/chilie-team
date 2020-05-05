package org.springframework.chilieteam.services.map;

import org.springframework.chilieteam.model.Player;
import org.springframework.chilieteam.services.CrudService;
import org.springframework.chilieteam.services.PlayerService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PlayerServiceMap extends AbstractServiceMap<Player, Long> implements PlayerService {

    @Override
    public Player findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Player save(Player object) {
        return super.save(object);
    }

    @Override
    public Set<Player> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Player object) {
        super.delete(object);
    }

    @Override
    public Player findBySurname(String surname) {
        return map.get(surname);
    }
}
