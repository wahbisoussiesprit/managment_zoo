package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {

    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.setName("Simba");
        lion.setAge(8);
        lion.setFamily("Cats");
        lion.setMammal(true);

        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        Zoo notMyZoo = new Zoo("WaterPark", "Siliana");


        Animal dog = new Animal("Canine", "Snoopy", 2, true);


        /*

        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "lll", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

        //   System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();


        System.out.println(myZoo);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(dog);
        myZoo.addAnimal(dog2);
        myZoo.displayAnimals();

        System.out.println("a" + myZoo.removeAnimal(lion));
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(dog2));
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(dog));
        myZoo.displayAnimals();




        Zoo zooWithMostAnimals = Zoo.compareZoo(myZoo, notMyZoo);
        System.out.println("The zoo with the most animals is: " + zooWithMostAnimals.getName());

        System.out.println(myZoo.isZooFull());

        */


        //prosit 5
        //aquatic myAquatic = new aquatic("some place") ;
        /*
        dolphin myDolphin = new dolphin("Red Sea",10) ;
        penguin myPenguin = new penguin("North Pole",20);

        */

        /*
        System.out.println("Aquatic Habitat : " +myAqutic.getHabitat());

        System.out.println("Dolphins Location :" +myDolphin.getHabitat());
        System.out.println("Dolphins Swimming Speed :" +myDolphin.getSwimmingSpeed());

        System.out.println("Penguins Location :" +myPenguin.getHabitat());
        System.out.println("Penguins Swimming Depth :" +myPenguin.getSwimmingDepth());
        */

        /*
        System.out.println(myDolphin) ;
        System.out.println(myPenguin) ;

        myAquatic.swim();
        myDolphin.swim();
        */

        /* prosit 6*/

        /*

        dolphin myDolphin = new dolphin("Red Sea", 10.0f);
        penguin myPenguin = new penguin("North Pole", 20.0f);

        myZoo.addAquaticAnimal(myDolphin);
        myZoo.addAquaticAnimal(myPenguin);

        myZoo.displayAquaticAnimal();

        float maxPenguinDepth = myZoo.maxPenguinSwimmingDepth();

        if (maxPenguinDepth >= 0) {
            System.out.println("Maximum penguin swimming depth: " + maxPenguinDepth);
        } else {
            System.out.println("No penguins found in the zoo.");
        }

        myZoo.displayNumberOfAquaticsByType();

        dolphin dolphin1 = new dolphin("Black Sea", 10.0f);
        dolphin dolphin2 = new dolphin("Pacific Ocean", 12.0f);

        penguin penguin1 = new penguin("Antarctica", 200.0f);
        penguin penguin2 = new penguin("Arctic Ocean", 150.0f);

        System.out.println("Comparing dolphins:");
        System.out.println("Dolphin1 and Dolphin2 live in the same habitat: " + dolphin1.equals(dolphin2));

        System.out.println("Comparing penguins:");
        System.out.println("Penguin1 and Penguin2 live in the same habitat: " + penguin1.equals(penguin2));

         */

        // prosit 7
/*
        try {
            Animal Koala = new Animal("Unknown", "Koli", -1, true);
            myZoo.addAnimal(Koala);
            Animal tiger = new Animal("Unknown", "sam", 3, true);
            myZoo.addAnimal(tiger);
            Animal bear = new Animal("Unknown", "masha", 2, true);
            myZoo.addAnimal(bear);
            Animal cobra = new Animal("Unknown", "andrew tate", 1, true);
            myZoo.addAnimal(cobra);
        }
        catch (ZooFullException e) {
            System.out.println("Le Zoo " + e.getMessage());
        }
         catch (InvalidAgeException i) {
            System.out.println(i.getMessage());
        }

        */

        //prosit 8

        penguin penguin = new penguin("Black Sea", 10.0f);
        penguin.eatMeat(Food.MEAT);
        
    }
}
