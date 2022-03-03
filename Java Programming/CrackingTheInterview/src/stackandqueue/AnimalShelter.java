package stackandqueue;

import java.util.LinkedList;
import java.util.Queue;

public class AnimalShelter {
	Queue<Animal> animalQueue;
	
	public AnimalShelter() {
		animalQueue = new LinkedList<Animal>();
	}
	
	public void enqueue(Animal animal) {
		animalQueue.add(animal);
	}
	
	public Animal dequeueAny() {
		return animalQueue.remove();
	}
	
	public Dog dequeueDog() {
		Queue<Animal> frontCats = new LinkedList<Animal>();
		Dog expectedToLeave;
		while(! (animalQueue.peek() instanceof Dog)) {
			frontCats.add(dequeueAny());
		}
		expectedToLeave = (Dog) animalQueue.remove();
		frontCats.addAll(animalQueue);
		animalQueue = frontCats;
		return expectedToLeave;
	}
	
	public Cat dequeueCat() {
		Queue<Animal> frontDogs = new LinkedList<Animal>();
		Cat expectedToLeave;
		while(! (animalQueue.peek() instanceof Cat)) {
			frontDogs.add(dequeueAny());
		}
		expectedToLeave = (Cat) animalQueue.remove();
		frontDogs.addAll(animalQueue);
		animalQueue = frontDogs;
		return expectedToLeave;
	}
}
