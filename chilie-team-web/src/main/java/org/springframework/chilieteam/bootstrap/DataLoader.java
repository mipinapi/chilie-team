package org.springframework.chilieteam.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.chilieteam.model.Coach;
import org.springframework.chilieteam.model.Player;
import org.springframework.chilieteam.model.Team;
import org.springframework.chilieteam.services.CoachService;
import org.springframework.chilieteam.services.PlayerService;
import org.springframework.chilieteam.services.TeamService;
import org.springframework.chilieteam.services.map.PlayerServiceMap;
import org.springframework.chilieteam.services.map.TeamServiceMap;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final PlayerService playerService;
    private final TeamService teamService;
    private final CoachService coachService;

    public DataLoader(PlayerService playerService, TeamService teamService, CoachService coachService) {
        this.playerService = playerService;
        this.teamService = teamService;
        this.coachService = coachService;
    }


    @Override
    public void run(String... args) throws Exception {

        Player player1 = new Player();
        player1.setName("Robin");
        player1.setSurname("Van Persie");
        playerService.save(player1);

        Player player2 = new Player();
        player2.setName("Luka");
        player2.setSurname("Modric");
        playerService.save(player2);
        System.out.println("Loaded players");

        Team team1 = new Team();
        team1.setName("FC Feyernoord");
        teamService.save(team1);

        Team team2 = new Team();
        team2.setName("FC Red Bull");
        teamService.save(team2);
        System.out.println("Loaded teams");

        Coach coach1 = new Coach();
        coach1.setName("Valeriy");
        coach1.setSurname("Lobanovskiy");
        coachService.save(coach1);

        Coach coach2 = new Coach();
        coach2.setName("Diego");
        coach2.setSurname("Simeone");
        coachService.save(coach2);
        System.out.println("Loaded coaches");

//        System.out.println(coachService.findAll().size());
    }
}
