package collegeProjectCars;

public class Car {
	private Info info;
	private Behavior behavior;
	private Parts parts;
	
	public Car(int yearFab, String color, String brand, int maxSpeed) {
		this.parts = new Parts();
		this.info = new Info(yearFab, color, brand, maxSpeed);
	}
	
	public void setEngine(String engine) {
		this.parts.setEngine(engine);
	}
	
	public void setExchange(String exchange) {
		this.parts.setExchange(exchange);
	}
	
	public void setChassis(int chassis) {
		this.parts.setChassis(chassis);
	}
	
	public void setSeat(String seat) {
		this.parts.setSeat(seat);
	}
	
	public void turnOn() {
		this.behavior.turnOn();
	}
	
	public void turnOff() {
		this.behavior.turnOff();
	}
	
	public void speedUp() {
		this.behavior.speedUp();
	}
	
	public void brake() {
		this.behavior.brake();
	}
	
	public String getPartialInfoAboutCar() {
		return "Ano de fabricação: " + this.info.getYearFab() + ", Cor: " + this.info.getColor() + ", Modelo: " + this.info.getBrand() + ", Vel. Máxima: " + this.info.getMaxSpeed();
	}
	
	public void getAllInfoAboutCar() {
		System.out.printf("Ano de fabricação do carro: %d\n"
				+ "Cor do carro: %s\n"
				+ "Marca do carro: %s\n"
				+ "Velocidade máxima do carro: %d\n"
				+ "Motor do carro: %s\n"
				+ "Tipo do câmbio do carro: %s\n"
				+ "Número do chassi do carro: %d\n"
				+ "Tipo do banco do carro: %s\n",
				this.info.getYearFab(),
				this.info.getColor(),
				this.info.getBrand(),
				this.info.getMaxSpeed(),
				this.parts.getEngine(),
				this.parts.getExchange(),
				this.parts.getChassis(),
				this.parts.getSeat());
	}
}
