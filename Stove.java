import java.util.HashMap;

public class Stove extends Appliance {

	private int Tempreture;

	// defult Constructor
	public Stove() {
		this.setTempreture(00);
	}

	// constuctor
	public Stove(int Tempreture) {
		this.setTempreture(Tempreture);
	}

	// Override
	public void start() {
		System.out.println("stove started");

	}

	public void running() {
		System.out.println("stove heating");

	}

	public void turnOff() {
		System.out.println("stove turned Off");

	}

	public void risingTemp(int x) {
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();


		map1.put(1, "lowTemp");
		map1.put(2, "MidTemp");
		map1.put(3, "HighTemp");

		if (x == 1)
			System.out.println(map1.get(1));
		else if (x == 2)
			System.out.println(map1.get(2));
		else if (x == 3)
			System.out.println(map1.get(3));
		else
			System.out.println("try to put number  1 or 2 or 3");
	}

	public int getTempreture() {
		return Tempreture;
	}

	public void setTempreture(int tempreture) {
		Tempreture = tempreture;
	}
	public void add (String n ,double x, int y){
		setMade(n) ;
		setPrice(x);
		setModel(y);
		System.out.println("stove is added");
	}
}
