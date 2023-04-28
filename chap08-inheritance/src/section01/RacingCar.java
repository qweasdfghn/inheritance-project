package section01;

public class RacingCar extends Car {
	
	public RacingCar() {
		super();
		System.out.println("RacingCar 클래스의 기본 생성자를 호출함...");
	}
	
	@Override
	public void run() {
		System.out.println("레이상카가 전속력으로 질주합니다!!!!");
	}
	
	@Override
	public void stop() {
		System.out.println("레이싱카가 멈춥니다.");
	}
	
	/* */

}
