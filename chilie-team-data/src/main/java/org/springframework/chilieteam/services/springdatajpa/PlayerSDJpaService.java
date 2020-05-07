package org.springframework.chilieteam.services.springdatajpa;

import org.springframework.chilieteam.model.Player;
import org.springframework.chilieteam.repositories.PlaceRepository;
import org.springframework.chilieteam.repositories.PlayerRepository;
import org.springframework.chilieteam.repositories.TeamRepository;
import org.springframework.chilieteam.services.PlaceService;
import org.springframework.chilieteam.services.PlayerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class PlayerSDJpaService implements PlayerService {

    private final PlayerRepository playerRepository;
    private final TeamRepository teamRepository;
    private final PlaceRepository placeRepository;

    public PlayerSDJpaService(PlayerRepository playerRepository, TeamRepository teamRepository,
                              PlaceRepository placeRepository) {
        this.playerRepository = playerRepository;
        this.teamRepository = teamRepository;
        this.placeRepository = placeRepository;
    }

    @Override
    public Player findBySurname(String surname) {
        return playerRepository.findBySurname(surname);
    }

    @Override
    public Set<Player> findAll() {
        Set<Player> players = new HashSet<>();
        playerRepository.findAll().forEach(players::add);
        return players;
    }

    @Override
    public Player findById(Long aLong) {
        return playerRepository.findById(aLong).orElse(null);
    }

    @Override
    public Player save(Player object) {
        System.out.println("##########");
        return playerRepository.save(object);
    }

    @Override
    public void delete(Player object) {
        playerRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        playerRepository.deleteById(aLong);
    }
}
