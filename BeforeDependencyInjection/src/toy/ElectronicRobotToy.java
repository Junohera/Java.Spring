package toy;

import battery.Battery;

public class ElectronicRobotToy {
	
	private Battery battery;
	
	public ElectronicRobotToy() {
		
	}

	public void setBatter(Battery battery) {
		this.battery = battery;
	}
}

// 배터리 분리형
// 배터리가 떨어지면 배터리만 교체하면 된다.