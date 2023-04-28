package Test;

import section01.Car;

public class ElectricCar extends CarTest {
	
	public ElectricCar () {
		super();
		System.out.println("전기차량은 50km 를 주행할 수 있습니다.");
	}
	
	
	
	public void refuel() {
		if(isRunning()) {
			System.out.println("시동을 꺼야 충전할 수 있습니다.");
		}else {
			System.out.println("충전이 완료되었습니다.");
		}
	
	
	}

	@Override
	public void run() {
		setRunningStatus(true);
	}
	
	@Override
	public void stop() {
		setRunningStatus(false);
	}


	public void recharge() {
		if(isRunning()) {
			System.out.println("시동을 꺼야 충전할 수 있습니다.");
		}else {
			System.out.println("충전이 완료되었습니다.");
		}
	}
}
