package generic;

public class Main {
    public static void main(String[] args) {
        Team<Baseball> baseballTeam = new Team<>("baseball");
        Team<Basketball> basketballTeam = new Team<>("basketball");
        League<Baseball> baseballLeague = new League<>("baseballLeague");
        League<Basketball> basketballLeague = new League<Basketball>("basketballLeague");

        baseballLeague.addTeam(baseballTeam);
    }
}
