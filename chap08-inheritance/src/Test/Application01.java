package Test;

import section01.Car;

public class Application01 {

	public static void main(String[] args) {
		
		CarList carlist = new CarList();
		CarChooseDTO cardto = new CarChooseDTO();
		System.out.println(cardto.toString());
		
		System.out.println();
		CarTest car = new CarTest();
		car.ignition();
		car.run();
		car.stop();
		
		
		System.out.println();
		ElectricCar electriccar = new ElectricCar();
		electriccar.run();
		electriccar.recharge();
		electriccar.stop();
		
		System.out.println();
		GasolineCar gasolincar = new GasolineCar();
		gasolincar.run();
		gasolincar.refuel();
		gasolincar.stop();
		
		
		System.out.println();
		PetrolCar petrolcar = new PetrolCar();
		petrolcar.run();
		petrolcar.stop();
		petrolcar.refuel();
		petrolcar.stop();

		
		

	}

}
