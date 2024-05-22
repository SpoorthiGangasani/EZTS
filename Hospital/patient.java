package Hospital;

public class patient extends person {
	int bedno;
	String disease;
	public patient(String name,int age, String gender, int bedno, String disease) {
		super(name,age,gender);
		this.bedno = bedno;
		this.disease = disease;
	}
	void patientout() {
		super.personout();
		System.out.println("bed number:"+this.bedno);
		System.out.println("disease name:"+this.disease);
	}
	

}
