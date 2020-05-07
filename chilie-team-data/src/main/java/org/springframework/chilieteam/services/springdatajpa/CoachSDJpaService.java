package org.springframework.chilieteam.services.springdatajpa;

import org.springframework.chilieteam.model.Coach;
import org.springframework.chilieteam.repositories.CoachRepository;
import org.springframework.chilieteam.repositories.FootballStyleRepository;
import org.springframework.chilieteam.services.CoachService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class CoachSDJpaService implements CoachService {

    private final CoachRepository coachRepository;
    private final FootballStyleRepository footballStyleRepository;

    public CoachSDJpaService(CoachRepository coachRepository, FootballStyleRepository footballStyleRepository) {
        this.coachRepository = coachRepository;
        this.footballStyleRepository = footballStyleRepository;
    }

    @Override
    public Set<Coach> findAll() {
        Set<Coach> coaches = new HashSet<>();
        coachRepository.findAll().forEach(coaches::add);
        return coaches;
    }

    @Override
    public Coach findById(Long aLong) {
        return coachRepository.findById(aLong).orElse(null);
    }

    @Override
    public Coach save(Coach object) {
        return coachRepository.save(object);
    }

    @Override
    public void delete(Coach object) {
        coachRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        coachRepository.deleteById(aLong);
    }
}
