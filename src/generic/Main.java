package generic;

public class Main {
    public static void main(String[] args) {


        League<Team<Baseball>> baseballLeague = new League<>("baseballLeague");
        League<Team<Basketball>> basketballLeague = new League<>("basketballLeague");

        Team<Baseball> baseballTeam = new Team<>("baseball");
        baseballTeam.setScore(1);
        Team<Basketball> basketballTeam = new Team<>("basketball");
        basketballTeam.setScore(23);
        Team<Baseball> baseballTeam2 = new Team<>("baseball2");
        baseballTeam2.setScore(12);
        Team<Basketball> basketballTeam2 = new Team<>("basketball2");
        basketballTeam2.setScore(21);

        baseballLeague.addTeam(baseballTeam);
        basketballLeague.addTeam(basketballTeam);

        baseballLeague.addTeam(baseballTeam2);
        basketballLeague.addTeam(basketballTeam2);

        //print out
        baseballLeague.listTeams();

        //print out basketball
        basketballLeague.listTeams();
    }
}
