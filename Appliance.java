public abstract class Appliance {

	protected String Made;
	protected double Price;
	protected int Model;
	
	public String toString (){
		return (Made +": "+Price + ": "+ Model );
		
	}

	public void setMade(String made) {
		Made = made;
	}

	public String getMade() {
		return Made;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public double getPrice() {
		return Price;
	}

	public void setModel(int model) {
		Model = model;
	}

	public int getModel() {
		return Model;
	}

	public abstract void start();

	public abstract void running();

	public abstract void turnOff();

	public void powerOn() {
		start();
		running();
		turnOff();
	}
	

}
