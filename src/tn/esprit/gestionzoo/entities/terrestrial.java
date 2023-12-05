package tn.esprit.gestionzoo.entities;

public abstract class terrestrial implements Omnivore <Food>{
    private int nbrLegs;

    public terrestrial(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    public void eatBoth(Food both) {
        if (both == Food.BOTH){
            System.out.println("This Animal Eats Almost Everything") ;
        }
    }
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT){
            System.out.println("This Aquatic Animals eats Only Meat");
        }else
        {
            System.out.println("This Aquatic Animal Doesnt Eat Meat ");
        }
    }
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT){
            System.out.println("This Aquatic Animals eats Only Herbs");
        }else
        {
            System.out.println("This Aquatic Animal Doesnt Eat Herbs ");
        }
    }
}
