package org.springframework.chilieteam.services.map;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.chilieteam.model.Player;


import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class PlayerServiceMapTest {

    PlayerServiceMap playerServiceMap;

    final Long playerId = 1L;
    final String name = "David";
    final String surname = "Seaman";

    @BeforeEach
    void setUp() {
        playerServiceMap = new PlayerServiceMap(new TeamServiceMap(), new PlaceServiceMap());
        playerServiceMap.save(Player.builder().id(playerId).name(name).surname(surname).build());
    }

    @Test
    void findById() {
        Player player = playerServiceMap.findById(playerId);
        assertEquals(playerId, player.getId());

    }

    @Test
    void save() {
        Long id = 2L;
        String raul = "Raul";
        String gonzalez = "Gonzalez";
        Player player = Player.builder().id(id).name(raul).surname(gonzalez).build();
        Player savedPlayer = playerServiceMap.save(player);
        assertEquals(id, savedPlayer.getId());
        assertEquals(raul, player.getName());
        assertEquals(gonzalez, player.getSurname());
    }

    @Test
    void saveNoId() {
        Player savedPlayer = playerServiceMap.save(Player.builder().name("Tom").surname("Porter").build());
        assertNotNull(savedPlayer);
        assertNotNull(savedPlayer.getId());
        System.out.println(savedPlayer.getId());
    }

    @Test
    void findAll() {
        Set<Player> players = playerServiceMap.findAll();
        assertEquals(1, players.size());
    }

    @Test
    void deleteById() {
        playerServiceMap.deleteById(playerId);
        assertEquals(0, playerServiceMap.findAll().size());
    }

    @Test
    void delete() {
        playerServiceMap.delete(playerServiceMap.findById(playerId));
        assertEquals(0, playerServiceMap.findAll().size());
    }

    @Test
    void findBySurname() {
        Player player3 = playerServiceMap.findBySurname(surname);
        assertNotNull(player3);
        assertEquals(playerId, player3.getId());
    }
}