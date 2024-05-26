package problems.queue.udemyCourse.animalShelter;

import java.util.LinkedList;

public class AnimalQueue {

    LinkedList<Cat> cats;
    LinkedList<Dog> dogs;
    private int order = 0;

    public AnimalQueue(){
        cats = new LinkedList<>();
        dogs = new LinkedList<>();
    }

    public void enqueue(Animal a){
        a.setOrder(order);
        order++;
        if(a instanceof Cat cat){
            cats.addLast(cat);
        } else {
            dogs.addLast((Dog) a);
        }
    }

    public int size() {
        return cats.size() + dogs.size();
    }

    public Dog dequeueDogs() {
        return dogs.poll();
    }

    public Dog peekDogs(){
        return dogs.peek();
    }
    public Cat dequeueCats() {
        return cats.poll();
    }

    public Cat peekCats(){
        return cats.peek();
    }

    public Animal dequeueAny() {
        if(dogs.isEmpty()){
            return dequeueCats();
        } else if(cats.isEmpty()) {
            return dequeueDogs();
        } else if(cats.peek().isOlderThan(dogs.peek())){
            return cats.poll();
        } else return dogs.poll();
    }

    public Animal peekAny() {
        if(dogs.isEmpty()){
            return dequeueCats();
        } else if(cats.isEmpty()) {
            return dequeueDogs();
        }
        Cat cat = cats.peek();
        Dog dog = dogs.peek();
        if(cat.isOlderThan(dog)){
            return cat;
        } else return dog;
    }

}