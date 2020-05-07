package org.springframework.chilieteam.services.springdatajpa;

import org.springframework.chilieteam.model.Statistic;
import org.springframework.chilieteam.repositories.StatisticRepository;
import org.springframework.chilieteam.services.StatisticService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class StatisticSDJpaService implements StatisticService {

    private final StatisticRepository statisticRepository;

    public StatisticSDJpaService(StatisticRepository statisticRepository) {
        this.statisticRepository = statisticRepository;
    }

    @Override
    public Set<Statistic> findAll() {
        Set<Statistic> statistics = new HashSet<>();
        statisticRepository.findAll().forEach(statistics::add);
        return statistics;
    }

    @Override
    public Statistic findById(Long aLong) {
        return statisticRepository.findById(aLong).orElse(null);
    }

    @Override
    public Statistic save(Statistic object) {
        return statisticRepository.save(object);
    }

    @Override
    public void delete(Statistic object) {
        statisticRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        statisticRepository.deleteById(aLong);
    }
}
