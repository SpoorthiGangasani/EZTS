package Hospital;

public class person {
	int age;
	String name,gender;
	public person(String name,int age, String gender) {
		this.age = age;
		this.name = name;
		this.gender = gender;
	}
	void personout()
	{
		System.out.println("name:"+this.name);
		System.out.println("age:"+this.age);
		System.out.println("gender:"+this.gender);
	}

}
