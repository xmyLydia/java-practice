package generic;

public class Team<T> implements Comparable<Team> {
    private String name;
    private int score = 0;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void addScore(int score) {
        this.score += score;
    }

    @Override
    public int compareTo(Team team) {
        return this.score - team.getScore();
    }
}
