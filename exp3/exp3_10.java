public class exp3_10{
	public static void main(String args[]){
		Cat c = new Cat();
		c.name = "猫老八";
		c.age = 2;
		System.out.println(c.showProfile());
		c.speak();

		Dog d = new Dog();
		d.name = "狗老八";
		d.age = 3;
		System.out.println(d.showProfile());
		d.speak();
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