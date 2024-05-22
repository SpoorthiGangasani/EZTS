package vehicle_oopc;

public class car extends master{
String fueltype;

public car(int model, int engine, String color, String fueltype) {
	super(model, engine, color);
	this.fueltype = fueltype;
}
void carout()
{	super.masteroutput();
	System.out.println("car fuel type:"+this.fueltype);
}
}
