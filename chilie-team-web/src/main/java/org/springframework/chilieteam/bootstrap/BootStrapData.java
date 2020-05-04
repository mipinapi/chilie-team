package org.springframework.chilieteam.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.chilieteam.model.Coach;
import org.springframework.chilieteam.model.Player;
import org.springframework.chilieteam.model.Team;
import org.springframework.chilieteam.repositories.CoachRepository;
import org.springframework.chilieteam.repositories.PlayerRepository;
import org.springframework.chilieteam.repositories.TeamRepository;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final PlayerRepository playerRepository;
    private final TeamRepository teamRepository;
    private final CoachRepository coachRepository;

    public BootStrapData(PlayerRepository playerRepository, TeamRepository teamRepository, CoachRepository coachRepository) {
        this.playerRepository = playerRepository;
        this.teamRepository = teamRepository;
        this.coachRepository = coachRepository;
    }

    @Override
    public void run(String... args) throws Exception {


        Coach averin = new Coach("Dmitry" , "Averin");
        Coach goryachkin = new Coach("Dmitry" , "Goryachkin");

        coachRepository.save(averin);
        coachRepository.save(goryachkin);

        Player mitya = new Player("Mitya", "Lukas");
        Team chile = new Team("Chile");
        mitya.getTeams().add(chile);
        chile.getPlayers().add(mitya);
        mitya.setCoach(averin);
        averin.getPlayers().add(mitya);

        playerRepository.save(mitya);
        teamRepository.save(chile);


        Player dima = new Player("Dima", "Kirsanov");
        Team noga = new Team("Noga");

        dima.getTeams().add(noga);
        noga.getPlayers().add(dima);
        dima.setCoach(averin);
        averin.getPlayers().add(dima);

        playerRepository.save(dima);
        teamRepository.save(noga);

        System.out.println(averin.getPlayers().size());
    }
}
