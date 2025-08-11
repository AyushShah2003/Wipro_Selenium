package LabSessions_24_07;

abstract class Bill{
	abstract void generateBill();
	public int amount;
	Bill(int amount){
		this.amount = amount;
	}
}


class ElectricityBill extends Bill{
	ElectricityBill(int amount) {
		super(amount);
	}
	@Override
	public void generateBill() {
		System.out.println("Electricity bill :"+amount);
	}
}

class WaterBill extends Bill{
	WaterBill(int amount) {
		super(amount);
	}
	@Override
	public void generateBill() {
		System.out.println("Water bill :"+amount);
	}
}

public class BillSubclasses {
	public static void main(String[] args) {
		ElectricityBill obj1 = new ElectricityBill(10000);
		WaterBill obj2 = new WaterBill(2000);
		obj1.generateBill();
		obj2.generateBill();
	}

}
