public class WashingMachine extends Appliance {

	private String WashingStuff;

	// defult Constructor
	public WashingMachine() {
		this.setWashingStuff("");
	}

	// Constructor
	public WashingMachine(String WashingStuff) {
		this.setWashingStuff(WashingStuff);
	}

	// overriding
	public void start() {
		System.out.println("WashingMachine started");
	}

	public void running() {
		System.out.println("WashingMachine working");

	}

	public void turnOff() {
		System.out.println("WashingMachine turned off");
	}
	public String doWork(int x){
		String [] array = {"washing","cleaning","wiping"};
			
		if(x==1)
			return array[0];
		else if (x==2)
			return array [1];
		else if (x==3)
			return array [2];
		else 
			System.out.println("try to put 1 or 2 or 3");
		return "";
		
	}

	public String getWashingStuff() {
		return WashingStuff;
	}

	public void setWashingStuff(String washingStuff) {
		WashingStuff = washingStuff;
	}
	public void add (String n ,double x, int y){
		setMade(n) ;
		setPrice(x);
		setModel(y);
		System.out.println("WashingMachine is added");
	}
}
