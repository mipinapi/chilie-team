package org.springframework.chilieteam.services.map;

import net.bytebuddy.description.modifier.Ownership;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.chilieteam.model.Coach;
import org.springframework.chilieteam.services.FootballStyleService;
import org.springframework.util.Assert;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class CoachServiceMapTest {

    CoachServiceMap coachServiceMap;

    final Long coachId = 1L;
    final String name = "Tito";
    final String surname = "Vilanova";

    @BeforeEach
    void setUp() {
        coachServiceMap = new CoachServiceMap(new FootballStyleServiceMap());
        coachServiceMap.save(Coach.builder().id(coachId).name(name).surname(surname).build());
    }

    @Test
    void findById() {
        Coach coach = coachServiceMap.findById(coachId);
        assertEquals(coachId, coach.getId());
    }

    @Test
    void save() {
    }

    @Test
    void findAll() {
        Set<Coach> coaches = coachServiceMap.findAll();
        assertEquals(1, coaches.size());
    }

    @Test
    void deleteById() {
    }

    @Test
    void delete() {
    }
}