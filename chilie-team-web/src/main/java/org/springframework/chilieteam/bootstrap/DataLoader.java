package org.springframework.chilieteam.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.chilieteam.model.*;
import org.springframework.chilieteam.services.*;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final PlayerService playerService;
    private final CoachService coachService;
    private final PlaceService placeService;
    private final FootballStyleService footballStyleService;

    public DataLoader(PlayerService playerService, CoachService coachService, PlaceService placeService,
                      FootballStyleService footballStyleService) {
        this.playerService = playerService;
        this.coachService = coachService;
        this.placeService = placeService;
        this.footballStyleService = footballStyleService;
    }


    @Override
    public void run(String... args) throws Exception {

        int count = placeService.findAll().size();

        if (count == 0) {
            loadData();
        }
    }

    private void loadData() {
        // Place
        Place netherlands = new Place();
        netherlands.setDescription("Netherlands");
//        Place savedNetherlands = placeService.save(netherlands);

        Place austria = new Place();
        austria.setDescription("Austria");
//        Place savedAustria = placeService.save(austria);

        // Coach Football Style
        FootballStyle autobus = new FootballStyle();
        autobus.setDescription("Autobus with contrattack");
        FootballStyle savedAutobus = footballStyleService.save(autobus);

        FootballStyle totalFootball = new FootballStyle();
        totalFootball.setDescription("Total Football");
        FootballStyle savedTotalFootball = footballStyleService.save(totalFootball);

        // Player

        Player player1 = new Player();
        player1.setName("Robin");
        player1.setSurname("Van Persie");
        Team feyernoord = new Team();
        feyernoord.setName("FC Feyernoord");
        feyernoord.setPlace(netherlands);
        feyernoord.getPlayers().add(player1);
        player1.getTeams().add(feyernoord);
        playerService.save(player1);


        Player player2 = new Player();
        player2.setName("Luka");
        player2.setSurname("Modric");
        Team redBull = new Team();
        redBull.setName("FC Red Bull");
        redBull.setPlace(austria);
        redBull.getPlayers().add(player2);
        player2.getTeams().add(redBull);
        playerService.save(player2);

        System.out.println("Loaded players and teams");


        Coach coach1 = new Coach();
        coach1.setName("Valeriy");
        coach1.setSurname("Lobanovskiy");
        coach1.getFootballStyles().add(savedTotalFootball);

        coachService.save(coach1);

        Coach coach2 = new Coach();
        coach2.setName("Diego");
        coach2.setSurname("Simeone");
        coach2.getFootballStyles().add(savedAutobus);
        coachService.save(coach2);
        System.out.println("Loaded coaches");

        System.out.println(footballStyleService.findAll().size());
    }
}
