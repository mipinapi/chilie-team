package org.springframework.chilieteam.services.map;

import org.springframework.chilieteam.model.Statistic;
import org.springframework.chilieteam.services.StatisticService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class StatisticServiceMap extends AbstractServiceMap<Statistic, Long> implements StatisticService {

    @Override
    public Set<Statistic> findAll() {
        return super.findAll();
    }

    @Override
    public Statistic findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Statistic save(Statistic object) {
        return super.save(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Statistic object) {
        super.delete(object);
    }
}
