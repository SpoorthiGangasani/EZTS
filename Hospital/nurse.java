package Hospital;

public class nurse extends person {
int floorno,pallocated,rno;

public nurse(String name, int age, String gender, int floorno, int pallocated, int rno) {
	super(name, age, gender);
	this.floorno = floorno;
	this.pallocated = pallocated;
	this.rno = rno;
}
void nurseout() {
	super.personout();
	System.out.println("room number:"+this.rno);
	System.out.println("floor number:"+this.floorno);
	System.out.println("number of patients allocated:"+this.pallocated);
}
}
