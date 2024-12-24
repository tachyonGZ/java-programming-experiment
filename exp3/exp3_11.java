public class exp3_11{
	public static void main(String args[]){
		Animal a[] = new Animal[] {new Cat(), new Dog(), new Cat(), new Dog()};
		for (Animal pa : a){
			pa.speak();
		}
	}
}

public class Dog extends Animal{
	public void speak(){
		System.out.println("void Dog::speak()");
	}
}

public class Cat extends Animal{
	public void sleep(){
		System.out.println("void Cat::speak()");
	}
}

public class Animal{
	public String name;
	public int age;
	public String showProfile(){
		return "Animal{name=" + this.name
			+ ",age=" + this.age
			+ "}";
	}

	public void speak(){
		System.out.println("void Animal::speak()");
	}
}