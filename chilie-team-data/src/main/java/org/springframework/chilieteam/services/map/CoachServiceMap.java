package org.springframework.chilieteam.services.map;

import org.springframework.chilieteam.model.Coach;
import org.springframework.chilieteam.model.Team;
import org.springframework.chilieteam.services.CoachService;
import org.springframework.chilieteam.services.CrudService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class CoachServiceMap extends AbstractServiceMap<Coach, Long> implements CoachService {

    @Override
    public Coach findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Coach save(Coach object) {
        return super.save(object);
    }

    @Override
    public Set<Coach> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Coach object) {
        super.delete(object);
    }
}
