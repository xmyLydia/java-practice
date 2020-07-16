package collectionChallenge.setChallenge;

import java.util.HashSet;
import java.util.Set;

/**
 * @author dev
 * @date 12/01/2016
 */
public final class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    private BodyTypes bodyTypes;

    private enum BodyTypes {
        //astronomical body orbiting a star
        PLANET,
        //astronomical body orbiting Earth
        MOON,
        //astronomical object consisting of a luminous spheroid of plasma
        // held together by its own gravity
        STAR
    }

    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyTypes) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
        this.bodyTypes = bodyTypes;
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addSatellite(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HeavenlyBody) {
            HeavenlyBody heavenlyBody = (HeavenlyBody) obj;
            if (heavenlyBody.getName().equals(this.getName())) {
                return heavenlyBody.getBodyTypes().equals(this.getBodyTypes());
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        System.out.println("hashcode called");
        return this.name.hashCode() + 57;
    }

    public BodyTypes getBodyTypes() {
        return bodyTypes;
    }

    public void setBodyTypes(BodyTypes bodyTypes) {
        this.bodyTypes = bodyTypes;
    }
}
