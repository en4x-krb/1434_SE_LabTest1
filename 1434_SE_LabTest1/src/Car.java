
public class Car {
	private int EngineCC;

	//Constructor to initialize engine capacity of the car
	public Car(int cc) {
		this.EngineCC = cc;
	}

	//Method to get car's engine capacity
	public int getEngineCapacity() {
		return this.EngineCC;
	}
}
