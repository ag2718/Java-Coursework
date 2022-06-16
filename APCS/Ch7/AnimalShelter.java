import java.util.ArrayList;

public class AnimalShelter {
    /**
     * A list of animals at the shelter, sorted by the age of the animal when it
     * arrived at the shelter, from least to greatest Guaranteed not to be null and
     * to contain only non-null entries
     */
    private ArrayList<Animal> allAnimals;

    public AnimalShelter() {
        allAnimals = new ArrayList<Animal>();
    }

    public ArrayList<Animal> getAnimals() {
        return allAnimals;
    }

    /** Creates and returns a new Animal object, as described in part (a) */
    private Animal createNewAnimal(String name, String type, double age) {

        int cost;
        if (age > 1)
            cost = 15;
        else {
            int numType = 0;
            for (Animal animal : allAnimals)
                if (animal.getType() == type)
                    numType++;

            cost = (numType >= 5) ? 20 : 25;
        }

        return new Animal(name, type, age, cost);
    }

    /** Adds an animal to the list allAnimals, as described in part (b) */
    public void addAnimal(String name, String type, double age) {

        int ind = 0;
        for (; ind < allAnimals.size() && allAnimals.get(ind).getAge() < age; ind++)
            ;
        allAnimals.add(ind, createNewAnimal(name, type, age));
    }

    public static void main(String[] args) {

        AnimalShelter shelter = new AnimalShelter();

        for (int i = 0; i < 6; i++)
            shelter.addAnimal("Bob", "dog", 2);

        shelter.addAnimal("Alice", "dog", 0.5);
        shelter.addAnimal("Charlie", "cat", 0.8);

        System.out.println(shelter.getAnimals()
                + " (expected: [(Alice, dog, 0.5, 20), (Charlie, cat, 0.8, 25), (Bob, dog, 2, 15), (Bob, dog, 2, 15), (Bob, dog, 2, 15), (Bob, dog, 2, 15), (Bob, dog, 2, 15)])");

    }

}
