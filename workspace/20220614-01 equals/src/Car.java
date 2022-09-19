
public class Car {
	private String model;
	public Car(String model) { this.model = model; }
	@Override
	public boolean equals(Object obj) {
		//Object obj 모든 obj 중에 Car과 비교해야함 
		if (obj instanceof Car) {
			return model.equals(((Car) obj).model);
			//Car = otherCar = (Car) obj;
			//return model.equals(otherCar.model);
		}else {
			return false;
		}
	}
}

