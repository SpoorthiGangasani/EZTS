package vehicle_oopc;

public class bike extends master {
String type;

public bike(int model, int engine, String color, String type) {
	super(model, engine, color);
	this.type = type;
}



@Override
public String toString() {
	return "bike [type=" + type + ", toString()=" + super.toString() + "]";
}



void bikeout()
{	super.masteroutput();
	System.out.println("bike type:"+this.type);
}

}
