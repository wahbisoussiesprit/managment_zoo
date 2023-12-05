package tn.esprit.gestionzoo.entities;
import java.util.Objects ;
public class penguin extends aquatic {
    private float swimmingDepth;

    public penguin(String habitat, float swimmingDepth) {
        super(habitat);
        this.swimmingDepth = swimmingDepth;
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public void swim() {
        System.out.println("Penguin is swimming at a depth of " + swimmingDepth + " meters.");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        penguin other = (penguin) obj;
        return Objects.equals(getHabitat(), other.getHabitat());
    }
}
