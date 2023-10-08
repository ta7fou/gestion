public class Terrestrial extends Animal {
    protected int nbrLegs;

    public Terrestrial(int nbrLegs, String habitat) {
        super(habitat);
        this.nbrLegs = nbrLegs;
    }
    @Override
    public String toString() {
        return "Habitat: " + habitat + ", Number of Legs: " + nbrLegs;
    }
}

