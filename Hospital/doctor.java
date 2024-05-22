package Hospital;

public class doctor extends person {
	String docspecial;

	public doctor(String name, int age, String gender, String docspecial) {
		super(name, age, gender);
		this.docspecial = docspecial;
	}
	void docout() {
		super.personout();
		System.out.println("docters's speciality:"+this.docspecial);
		
	}

}
