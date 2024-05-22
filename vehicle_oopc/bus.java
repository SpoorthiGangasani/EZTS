package vehicle_oopc;

public class bus extends master {
int capacity;

public bus(int model, int engine, String color, int capacity) {
	super(model, engine, color);
	this.capacity = capacity;
}
void busout()
{	super.masteroutput();
	System.out.println(" capacity:"+this.capacity);
}

}
