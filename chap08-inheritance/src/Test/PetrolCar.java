package Test;

import section01.Car;

public class PetrolCar extends CarTest  {

	public PetrolCar () {
		super();
		System.out.println("경유 차량은 150km 를 주행할 수 있습니다.");
	}
	@Override
	public void run() {
		setRunningStatus(true);
	}
	
	@Override
	public void stop() {
		setRunningStatus(false);
	}
	
	public void refuel() {
		if(isRunning()) {
			System.out.println("시동을 꺼야 주유할 수 있습니다.");
		}else {
			System.out.println("주유가 완료되었습니다.");
		}
	}

}
