package org.springframework.chilieteam.services.springdatajpa;

import org.springframework.chilieteam.model.Team;
import org.springframework.chilieteam.repositories.TeamRepository;
import org.springframework.chilieteam.services.TeamService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class TeamSDJpaService implements TeamService {

    private final TeamRepository teamRepository;

    public TeamSDJpaService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @Override
    public Set<Team> findAll() {
        Set<Team> teams = new HashSet<>();
        teamRepository.findAll().forEach(teams::add);
        return teams;
    }

    @Override
    public Team findById(Long aLong) {
        return teamRepository.findById(aLong).orElse(null);
    }

    @Override
    public Team save(Team object) {
        return teamRepository.save(object);
    }

    @Override
    public void delete(Team object) {
        teamRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        teamRepository.deleteById(aLong);
    }
}
