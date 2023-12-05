package tn.esprit.gestionzoo.entities;
public abstract class aquatic implements Carnivore <Food>{
    private String habitat;


    public aquatic(String habitat) {
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    @Override
    public String toString() {
        return "Habitat: " + habitat;
    }

    public abstract void swim();

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT){
            System.out.println("This Aquatic Animals eats Only Meat");
        }else
        {
            System.out.println("This Aquatic Animal Doesnt Eat Meat ");
        }
    }
    public void eatBoth(Food both) {
        if (both == Food.BOTH){
            System.out.println("This Animal Eats Almost Everything") ;
        }
    }

}
