package generic;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author mingyux
 */
public class League<T extends Team> {
    private ArrayList<T> league = new ArrayList<>();
    private String name;

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean addTeam(T team) {
        if (league.contains(team)) {
            System.out.println("team already exists");
            return false;
        } else {
            league.add(team);
            return true;
        }
    }

    public void listTeams() {
        Collections.sort(league);
        for (T t : league) {
            System.out.println(t.getName() + " : " + t.getScore());
        }
    }
}
