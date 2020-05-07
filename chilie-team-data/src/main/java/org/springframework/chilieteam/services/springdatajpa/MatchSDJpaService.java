package org.springframework.chilieteam.services.springdatajpa;

import org.springframework.chilieteam.model.FootballStyle;
import org.springframework.chilieteam.model.Match;
import org.springframework.chilieteam.repositories.MatchRepository;
import org.springframework.chilieteam.services.MatchService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class MatchSDJpaService implements MatchService {

    private final MatchRepository matchRepository;

    public MatchSDJpaService(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }

    @Override
    public Set<Match> findAll() {
        Set<Match> matches = new HashSet<>();
        matchRepository.findAll().forEach(matches::add);
        return matches;
    }

    @Override
    public Match findById(Long aLong) {
        return matchRepository.findById(aLong).orElse(null);
    }

    @Override
    public Match save(Match object) {
        return matchRepository.save(object);
    }

    @Override
    public void delete(Match object) {
        matchRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        matchRepository.deleteById(aLong);
    }
}
