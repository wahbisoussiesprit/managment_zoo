package tn.esprit.gestionzoo.entities;

public interface Omnivore <T> extends Carnivore<T>,Herbivore<T>{
    public void eatPlantandMeat(T food) ;
}
