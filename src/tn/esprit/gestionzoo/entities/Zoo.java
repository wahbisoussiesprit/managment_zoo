package tn.esprit.gestionzoo.entities;

public class Zoo {
    public static final int NUMBER_OF_CAGES = 25;
    private Animal[] animals;
    private String name, city;
    private int nbrAnimals;

    private aquatic[] aquaticAnimals;
    private int numberOfAquaticAnimals;

    public Zoo() {
        aquaticAnimals = new aquatic[10];
        numberOfAquaticAnimals = 0;
    }

    public Zoo(String name, String city) {
        animals = new Animal[NUMBER_OF_CAGES];
        this.name = name;
        this.city = city;
        aquaticAnimals = new aquatic[10];
        numberOfAquaticAnimals = 0;
    }

    static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals)
            return z1;
        return z2;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank())
            System.out.println("The Zoo name cannot be empty");
        else
            this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }

    void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals);
    }

    public void addAnimal(Animal animal) throws InvalidAgeException {
        if (nbrAnimals >= 3)
        {
          //  throw new ZooFullException("est plein.");
        }else if (animal.getAge()<0){
            throw new InvalidAgeException("Invalid Age");
        }else{
            animals[nbrAnimals] = animal;
            nbrAnimals++;
        }
    }


    public boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimals; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimals] = null;
        this.nbrAnimals--;
        return true;
    }

    public void displayAnimals() {
        System.out.println("List of animals of " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.getName() == animals[i].getName())
                return i;
        }
        return index;
    }

    public boolean isZooFull() {
        return nbrAnimals == NUMBER_OF_CAGES;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals;
    }

    public static Zoo compareZoo(Zoo z1 , Zoo z2)
    {
        if(z1.nbrAnimals>z2.nbrAnimals)
        {
            System.out.println("Z1 has more Animals Than Z2") ;
            return z1 ;
        }
        else
        {
            System.out.println("Z2 has more Animals Than Z1");
            return z2 ;
        }

    }

    public void addAquaticAnimal(aquatic aquatic)
    {
        if (numberOfAquaticAnimals < 10)
        {
            aquaticAnimals[numberOfAquaticAnimals] = aquatic ;
            numberOfAquaticAnimals++ ;
            System.out.println("Animal Aquatique a ete ajouter !");
        }
        else
        {
            System.out.println("Impossible D'ajouter Un Animal Aquatique ! ") ;
        }
    }

    public void displayAquaticAnimal() {
        System.out.println("Affichage des animaux aquatiques :");
        for (int i = 0; i < numberOfAquaticAnimals; i++) {
            aquaticAnimals[i].swim();
        }
    }

    public float maxPenguinSwimmingDepth() {
        float maxDepth = -1.0f; // Set an initial value that indicates no penguins found

        for (int i = 0; i < numberOfAquaticAnimals; i++) {
            if (aquaticAnimals[i] instanceof penguin) {
                penguin penguinAnimal = (penguin) aquaticAnimals[i];
                if (penguinAnimal.getSwimmingDepth() > maxDepth) {
                    maxDepth = penguinAnimal.getSwimmingDepth();
                }
            }
        }

        return maxDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int numDolphins = 0;
        int numPenguins = 0;

        for (int i = 0; i < numberOfAquaticAnimals; i++) {
            if (aquaticAnimals[i] instanceof dolphin) {
                numDolphins++;
            } else if (aquaticAnimals[i] instanceof penguin) {
                numPenguins++;
            }
        }

        System.out.println("Number of Dolphins: " + numDolphins);
        System.out.println("Number of Penguins: " + numPenguins);
    }


}
