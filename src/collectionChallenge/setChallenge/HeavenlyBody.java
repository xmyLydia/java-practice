package collectionChallenge.setChallenge;

import java.util.HashSet;
import java.util.Set;

/**
 * @author dev
 * @date 12/01/2016
 */
public abstract class HeavenlyBody {
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    private Key key;

    public enum BodyTypes {
        //astronomical body orbiting a star
        PLANET,
        //astronomical body orbiting Earth
        MOON,
        //astronomical object consisting of a luminous spheroid of plasma
        // held together by its own gravity
        STAR,
        //a planetary-mass object that does not dominate its region of space
        DWARF_PLANET
    }

    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyTypes) {
        this.key = new Key(name, bodyTypes);
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
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

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HeavenlyBody) {
            HeavenlyBody heavenlyBody = (HeavenlyBody) obj;
            return this.key.equals(heavenlyBody.getKey());
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.key.hashCode();
    }

    public static Key makeKey(String name, BodyTypes bodyTypes) {
        return new Key(name, bodyTypes);
    }
    @Override
    public String toString() {
        return "HeavenlyBody{" +
                "name='" + key.name + '\'' +
                ", orbitalPeriod=" + orbitalPeriod +
                ", satellites=" + satellites +
                ", bodyTypes=" + key.bodyTypes +
                '}';
    }

    public static final class Key{
        private String name;
        private BodyTypes bodyTypes;

        public Key(String name, BodyTypes bodyTypes) {
            this.name = name;
            this.bodyTypes = bodyTypes;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public BodyTypes getBodyTypes() {
            return bodyTypes;
        }

        public void setBodyTypes(BodyTypes bodyTypes) {
            this.bodyTypes = bodyTypes;
        }

        @Override
        public boolean equals(Object o) {
            Key key = (Key) o;
           if(this.getName().equals(key.getName())){
               return (this.bodyTypes == key.getBodyTypes());
           }
           return false;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode() + 57 + this.bodyTypes.hashCode();
        }
    }
}
