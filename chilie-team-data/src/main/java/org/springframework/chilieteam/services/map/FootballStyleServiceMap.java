package org.springframework.chilieteam.services.map;

import org.springframework.chilieteam.model.FootballStyle;
import org.springframework.chilieteam.services.FootballStyleService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class FootballStyleServiceMap extends AbstractServiceMap<FootballStyle, Long> implements FootballStyleService {

    @Override
    public Set<FootballStyle> findAll() {
        return super.findAll();
    }

    @Override
    public FootballStyle findById(Long id) {
        return super.findById(id);
    }

    @Override
    public FootballStyle save(FootballStyle object) {
        return super.save(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(FootballStyle object) {
        super.delete(object);
    }
}

