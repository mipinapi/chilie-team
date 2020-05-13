package org.springframework.chilieteam.services.springdatajpa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.chilieteam.model.Player;
import org.springframework.chilieteam.repositories.PlaceRepository;
import org.springframework.chilieteam.repositories.PlayerRepository;
import org.springframework.chilieteam.repositories.TeamRepository;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PlayerSDJpaServiceTest {

    public static final String ROONEY = "Rooney";
    public static final String WAYNE = "Wayne";
    public static final long ID = 1L;
    @Mock
    PlayerRepository playerRepository;

    @Mock
    TeamRepository teamRepository;

    @Mock
    PlaceRepository placeRepository;

    @InjectMocks
    PlayerSDJpaService playerSDJpaService;

    Player returnPlayer;

    @BeforeEach
    void setUp() {
        returnPlayer = Player.builder().id(1L).name("Name").surname("Loki").build();
    }

    @Test
    void findBySurname() {
        Player returnPlayer = Player.builder().id(ID).name(WAYNE).surname(ROONEY).build();
        when(playerRepository.findBySurname(any())).thenReturn(returnPlayer);
        Player rooney = playerSDJpaService.findBySurname(ROONEY);
        assertEquals(ROONEY, rooney.getSurname());
        verify(playerRepository).findBySurname(any());
    }

    @Test
    void findAll() {
        Set<Player> returnPlayerSet = new HashSet<>();
        returnPlayerSet.add(Player.builder().id(1L).name("Carlos").surname("Tevez").build());
        returnPlayerSet.add(Player.builder().id(1L).name("Bano").surname("Ivanovic").build());
        when(playerRepository.findAll()).thenReturn(returnPlayerSet);
        Set<Player> players = playerSDJpaService.findAll();
        assertNotNull(players);
        assertEquals(2, players.size());
    }

    @Test
    void findById() {
        when(playerRepository.findById(anyLong())).thenReturn(Optional.of(returnPlayer));
        Player player = playerSDJpaService.findById(1L);
        assertNotNull(player);
    }


    @Test
    void findNotFound() {
        when(playerRepository.findById(anyLong())).thenReturn(Optional.empty());
        Player player = playerSDJpaService.findById(1L);
        assertNull(player);
    }

    @Test
    void save() {
        Player playerToSave = Player.builder().id(1L).build();
        when(playerRepository.save(any())).thenReturn(returnPlayer);
        Player savedPlayer = playerSDJpaService.save(playerToSave);
        assertNotNull(savedPlayer);
    }

    @Test
    void delete() {
        playerSDJpaService.delete(returnPlayer);
        verify(playerRepository).delete(any());
    }

    @Test
    void deleteById() {
        playerSDJpaService.deleteById(1L);
        verify(playerRepository).deleteById(anyLong());
    }
}