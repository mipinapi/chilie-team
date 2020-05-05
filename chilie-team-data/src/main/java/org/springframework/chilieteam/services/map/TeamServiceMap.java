package org.springframework.chilieteam.services.map;

import org.springframework.chilieteam.model.Player;
import org.springframework.chilieteam.model.Team;
import org.springframework.chilieteam.services.CrudService;
import org.springframework.chilieteam.services.TeamService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class TeamServiceMap extends AbstractServiceMap<Team, Long> implements TeamService {

    @Override
    public Team findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Team save(Team object) {
        return super.save(object);
    }

    @Override
    public Set<Team> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Team object) {
        super.delete(object);
    }
}
