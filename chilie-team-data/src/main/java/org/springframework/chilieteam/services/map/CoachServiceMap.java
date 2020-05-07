package org.springframework.chilieteam.services.map;

import org.springframework.chilieteam.model.Coach;
import org.springframework.chilieteam.model.FootballStyle;
import org.springframework.chilieteam.model.Team;
import org.springframework.chilieteam.services.CoachService;
import org.springframework.chilieteam.services.CrudService;
import org.springframework.chilieteam.services.FootballStyleService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class CoachServiceMap extends AbstractServiceMap<Coach, Long> implements CoachService {

    private final FootballStyleService footballStyleService;

    public CoachServiceMap(FootballStyleService footballStyleService) {
        this.footballStyleService = footballStyleService;
    }

    @Override
    public Coach findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Coach save(Coach object) {

        if (object.getFootballStyles().size() > 0) {
            object.getFootballStyles().forEach(style -> {
                if (style.getId() == null) {
                    FootballStyle savedStyle = footballStyleService.save(style);
                    savedStyle.setId(savedStyle.getId());
                }
            });
        }

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
