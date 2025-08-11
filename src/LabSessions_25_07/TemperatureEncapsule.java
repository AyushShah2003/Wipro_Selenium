package LabSessions_25_07;

class Temperature{
	private float tempVal;
	private String tempType = "Celcius";
	
	public void setTemperature(float temp) {
		this.tempVal = temp;
	}
	
	public void ConvertTemperature(float temp, String type) {
		this.tempVal = temp;
		this.tempType = type;
	}
	
	public void getTemperature() {
		System.out.println("Current temperature is "+tempVal+" "+tempType);
	}
}

public class TemperatureEncapsule {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temperature obj = new Temperature();
		obj.setTemperature(55);
		obj.getTemperature();
		obj.ConvertTemperature(64, "farenhite");
		obj.getTemperature();
	}

}