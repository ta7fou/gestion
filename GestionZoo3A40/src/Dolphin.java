public class Dolphin extends Aquatic {
    private float swimmingSpeed;

    public Dolphin(String habitat, float swimmingSpeed) {
        super(habitat);
        this.swimmingSpeed = swimmingSpeed;
    }
    public String toString() {
        return "Habitat: " + habitat;
    }
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }
}

