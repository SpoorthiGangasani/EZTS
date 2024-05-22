package vehicle_oopc;

public class master {
 int model;
 int engine;
 String color;
 public master(int model, int engine, String color) {
	this.model = model;
	this.engine = engine;
	this.color = color;
}
  void masteroutput()
  {
	  System.out.println("model:"+this.model);
	  System.out.println("engine:"+this.engine);
	  System.out.println("color:"+this.color);
  }
}
