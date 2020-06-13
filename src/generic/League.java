package generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author mingyux
 */
public class League<T extends Team> {
    List<T> teams = new ArrayList<>();

    public boolean addTeam(T team) {
        if (teams.contains(team)) {
            System.out.println("team already exists");
            return false;
        } else {
            teams.add(team);
            System.out.println(team.getName());
            return true;
        }
    }

    public void listTeams() {
        Collections.sort(teams);
        for (Team team : teams) {
            System.out.println(team.getName());
        }
    }
}
