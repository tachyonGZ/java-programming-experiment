public class exp3_7{
	public static void main(String args[]){
		Student s = new Student();
		System.out.println(s.toString());
	}
}

public class Student{
	public String id;
	public String name;
	public String gender;
	public String classid;
	public int age;
	public Student(){
		this.id = "8";
		this.name = "李老八";
		this.gender = "男";
		this.classid = "1";
		this.age = 18;
	}
	public String getId(){
		return this.id;
	}
	public String getName(){
		return this.name;
	}
	public String getGender(){
		return this.gender;
	}
	public String GetClassId(){
		return this.classid;
	}
	public int getAge(){
		return this.age;
	}
	public void setAge(int age){
		this.age = age;
	}
	public String toString(){
		return 
			"Student{id=" + this.id
			+ ",name=" + this.name
			+ ",gender=" + this. gender
			+ ",classid=" + this.classid
			+ ",age=" + this.age
			+"}";
	}
}