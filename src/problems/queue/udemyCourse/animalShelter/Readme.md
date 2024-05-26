# Animal Shelter

An animal shelter, which holds only dogs and cats, operates on a strictly "first in, first out" basis. People must adopt either the "oldest" (based on arrival time) of all animals at the shelter, or they can select whether they would prefer a dog or a cat (and will receive the oldest animal of that type). They cannot select which specific animal they would like. Create the data structures to maintain this system and implement operations such as enqueue, dequeueAny, dequeueDog, and dequeueCat.

### Example 1:

    AnimalQueue animals = new AnimalQueue();
    animals.enqueue(new Cat("Kiki"));
    animals.enqueue(new Cat("Kari"));
    animals.enqueue(new Dog("Beji"));
    animals.enqueue(new Cat("Reki"));
    animals.enqueue(new Dog("Dexter"));
    
    animals.dequeueAny().name();
    animals.dequeueDogs().name();
    animals.dequeueCats().name();
    
    //Output
    Cat: Kiki
    Dog: Beji
    Cat: Kari

    Explanation :
    The oldest cat is Kiki.
    The oldest dog is Beji.
    The second olderst cat is Kari.

## Your Task:
- You don't have to read input or print anything. Your task is to complete the functions in AnimalQueue class.

### Expected Time Complexity: O(n)
### Expected Auxiliary Space: O(1)