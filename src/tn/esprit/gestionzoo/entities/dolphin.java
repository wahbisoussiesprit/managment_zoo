package tn.esprit.gestionzoo.entities;
import java.util.Objects ;

public class dolphin extends aquatic {
    private float swimmingSpeed;

    public dolphin(String habitat, float swimmingSpeed) {
        super(habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public String toString() {
        return "Dolphin - " + super.toString() + ", Swimming Speed: " + swimmingSpeed ;
    }

    @Override
    public void swim() {
        System.out.println("Dolphin is swimming at " + swimmingSpeed + " knots.");
    }

    /*
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        dolphin other = (dolphin) obj;

        return Objects.equals(getHabitat(), other.getHabitat());
    }
    */
}