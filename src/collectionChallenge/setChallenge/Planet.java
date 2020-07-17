package collectionChallenge.setChallenge;

public class Planet extends HeavenlyBody {
    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.PLANET);
    }

    @Override
    public boolean addSatellite(HeavenlyBody moon) {
        if (moon.getBodyTypes() == BodyTypes.MOON) {
            super.addSatellite(moon);
        }
        return false;
    }
}
