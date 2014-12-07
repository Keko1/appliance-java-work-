public class Refrigerator extends Appliance {

	private int Capcity;

	// defult Constructor
	public Refrigerator() {
		this.setCapcity(00);
	}

	// constuctor
	public Refrigerator(int Capcity) {
		this.setCapcity(Capcity);
	}

	// Override
	public void start() {
		System.out.println("Refrigerator started");

	}

	public void running() {
		System.out.println("Refrigerator working");

	}

	public void turnOff() {
		System.out.println("Refrigerator Turned off");

	}

	public int getCapcity() {
		return Capcity;
	}

	public void setCapcity(int capcity) {
		Capcity = capcity;
	}
	public void add (String n ,double x, int y){
		setMade(n) ;
		setPrice(x);
		setModel(y);
		System.out.println("refregerator is added");
	}

}
