package problems.queue.udemyCourse.animalShelter;

public class Main {

    public static void main(String[] args) {

        AnimalQueue animals = new AnimalQueue();
        animals.enqueue(new Cat("Kiki"));
        animals.enqueue(new Cat("Kari"));
        animals.enqueue(new Dog("Beji"));
        animals.enqueue(new Cat("Reki"));
        animals.enqueue(new Dog("Dexter"));

        System.out.println("DequeueAny - " + animals.dequeueAny().name());
        System.out.println("DequeueDog - " + animals.dequeueDogs().name());
        System.out.println("DequeueCat - " + animals.dequeueCats().name());

    }

}