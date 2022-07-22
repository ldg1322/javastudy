package ch07.Animal;

public class AnimalEx {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("--------------");
		
		// 다형성 : 상속관계 추상 클래스와 상속 받은 클래스
		// 변수의 자동 타입 변환
		Animal animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("--------------");
		
		// 메서드의 다형성
		animalSound(new Dog());
		animalSound(new Cat());
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
