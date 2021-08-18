package ch10_1_exception_class;

public class ClassCastExceptionExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
	}
	                               
	                            //Animal animal = Animal cat
	public static void changeDog(Animal animal) {
		if (animal instanceof Dog) {
			Dog dog = (Dog) animal; //ClassCastException 발생가능
		}else {
			System.out.println("Dog 타입이 아닙니다.");
		}
	}
}
class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}