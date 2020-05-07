package org.springframework.chilieteam.services.map;

import org.springframework.chilieteam.model.Player;
import org.springframework.chilieteam.model.Team;
import org.springframework.chilieteam.services.*;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PlayerServiceMap extends AbstractServiceMap<Player, Long> implements PlayerService {

    private final TeamService teamService;
    private final PlaceService placeService;

    public PlayerServiceMap(TeamService teamService, PlaceService placeService) {
        this.teamService = teamService;
        this.placeService = placeService;
    }


    @Override
    public Player findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Player save(Player object) {

        Player savedPlayer = null;

        if (object != null) {
            if (object.getTeams() != null) {
                object.getTeams().forEach(team -> {
                    if (team.getPlace() != null) {
                        if (team.getPlace().getId() == null) {
                            team.setPlace(placeService.save(team.getPlace()));
                        }
                    } else {
                        throw new RuntimeException("Place is required");
                    }

                    if (team.getId() == null) {
                        Team savedTeam = teamService.save(team);
                        team.setId(savedTeam.getId());
                    }

                });
            }
            return super.save(object);
        } else {
            return null;
        }
    }

    @Override
    public Set<Player> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Player object) {
        super.delete(object);
    }

    @Override
    public Player findBySurname(String surname) {
        return map.get(surname);
    }
}
