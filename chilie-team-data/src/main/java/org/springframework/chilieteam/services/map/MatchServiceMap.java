package org.springframework.chilieteam.services.map;

import org.springframework.chilieteam.model.Match;
import org.springframework.chilieteam.services.MatchService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class MatchServiceMap extends AbstractServiceMap<Match, Long> implements MatchService {

    @Override
    public Set<Match> findAll() {
        return super.findAll();
    }

    @Override
    public Match findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Match save(Match object) {
        return super.save(object);
    }

    @Override
    public void delete(Match object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
