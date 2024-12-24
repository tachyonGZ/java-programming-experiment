public class exp3_8{
	public static void main(String args[]){
		Cat c = new Cat();
		c.name = "猫老八";
		c.age = 2;
		System.out.println(c.showProfile());
		c.sleep();
	}
}

public class Cat extends Animal{
	public void sleep(){
		System.out.println("void Cat::sleep()");
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
}