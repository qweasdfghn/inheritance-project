package Test;

import Test.CarChooseDTO;

public class CarList {
	
	public void ownerList () {
	
	CarChooseDTO[] car = new CarChooseDTO[3];
	
	car[0] = new CarChooseDTO("홍길동", "휘발유", 3000, 3);
	car[1] = new CarChooseDTO("유관순", "경유", 2000, 4);
	car[2] = new CarChooseDTO("이순신", "전기", 7000, 5);
	
	}

	@Override
	public String toString() {
		return "CarList [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
}
