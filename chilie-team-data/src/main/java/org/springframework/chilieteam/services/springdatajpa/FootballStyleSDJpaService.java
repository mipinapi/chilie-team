package org.springframework.chilieteam.services.springdatajpa;

import org.springframework.chilieteam.model.FootballStyle;
import org.springframework.chilieteam.repositories.FootballStyleRepository;
import org.springframework.chilieteam.services.FootballStyleService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class FootballStyleSDJpaService implements FootballStyleService {

    private final FootballStyleRepository footballStyleRepository;

    public FootballStyleSDJpaService(FootballStyleRepository footballStyleRepository) {
        this.footballStyleRepository = footballStyleRepository;
    }

    @Override
    public Set<FootballStyle> findAll() {
        Set<FootballStyle> footballStyles = new HashSet<>();
        footballStyleRepository.findAll().forEach(footballStyles::add);
        return footballStyles;
    }

    @Override
    public FootballStyle findById(Long aLong) {
        return footballStyleRepository.findById(aLong).orElse(null);
    }

    @Override
    public FootballStyle save(FootballStyle object) {
        return footballStyleRepository.save(object);
    }

    @Override
    public void delete(FootballStyle object) {
        footballStyleRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        footballStyleRepository.deleteById(aLong);
    }
}
