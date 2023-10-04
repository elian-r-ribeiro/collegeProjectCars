package collegeProjectCars;

public class Info{
	private int yearFab;
	private String color;
	private String brand;
	private int maxSpeed;
	
	public Info(int yearFab, String color, String brand, int maxSpeed) {
		this.yearFab = yearFab;
		this.color = color;
		this.brand = brand;
		this.maxSpeed = maxSpeed;
	}

	public int getYearFab() {
		return yearFab;
	}

	public void setYearFab(int yearFab) {
		this.yearFab = yearFab;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

}
