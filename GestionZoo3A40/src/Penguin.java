public class Penguin extends Aquatic {
    private float swimmingDepth;

    public Penguin(String habitat, float swimmingDepth) {
        super(habitat);
        this.swimmingDepth = swimmingDepth;
    }
    public String toString() {
        return "Habitat: " + habitat;
    }
    public void swim() {
        System.out.println("This penguin is swimming.");
    }
}
