import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Stove stove1 = new Stove();
		stove1.powerOn();

		// polymorephsim (many shapes)
		Appliance WashingM1 = new WashingMachine();
		WashingM1.start();

		stove1.risingTemp(1);

		WashingMachine WashM1 = new WashingMachine();

		System.out.println(WashM1.doWork(3));

	}

	public void addstuff() {
		System.out.println("add to store what do u want to add "
				+ "1)refregerator  2)washing mashine 3)stove");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		
		System.out.println("start add the Made , price and model");

		String NameOfstuff = input.nextLine();
		double price = input.nextDouble();
		int model = input.nextInt();
		
		if (x == 1) {
			Refrigerator ref = new Refrigerator();
			ref.add(NameOfstuff,price,model);
		}
		else if (x == 2) {
			WashingMachine wF = new WashingMachine();
			wF.add(NameOfstuff,price,model);
		}
		else if (x == 3) {
			Stove ST1 = new Stove();
			ST1.add(NameOfstuff,price,model);
		}
		else
			System.out.println("u entered worng choice");
	}
	
}
