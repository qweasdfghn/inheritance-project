package Test;

public class CarTest {

	private boolean runningStatus;
	
	public CarTest() {
		System.out.println("CarTest 클래스의 기본 생성자 호출됨...");
	}
	
	public void run() {
		
		runningStatus = true;
		System.out.println("자동차가 달립니다.");
		}
	
	public void ignition() {
		
		if(isRunning()) {
			System.out.println("이미 시동이 켜져있습니다.");
		}else {
			System.out.println("시동을 켭니다.");
		}
	}
	
    protected boolean isRunning() {
		return runningStatus;
	}
    
	public void setRunningStatus(boolean runningStatus) {
		this.runningStatus = runningStatus;
	}

	public void stop() {
	runningStatus = false;
	System.out.println("자동차가 멈춥니다.");
	}
	
}
