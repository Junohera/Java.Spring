import battery.Battery;
import battery.ChargeBattery;
import toy.ElectronicCarToy;
import toy.ElectronicRadioToy;
import toy.ElectronicRobotToy;

public class MainClass {
	
	public static void main(String[] args) {
		
		ElectronicCarToy carToy = new ElectronicCarToy();
		
		ElectronicRobotToy robotToy = new ElectronicRobotToy();
		
		ElectronicRadioToy radioToy = new ElectronicRadioToy(new ChargeBattery());
		
	}

}
