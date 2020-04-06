package factory;


public abstract class BasicUnit {

	private String name;
	private String description;
	private double damage;
	private int utilityRate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getDamage() {
		return damage;
	}

	public void setDamage(double damage) {
		this.damage = damage;
	}

	public int getUtilityRate() {
		return utilityRate;
	}

	public void setUtilityRate(int utilityRate) {
		this.utilityRate = utilityRate;
	}

	public void displayUnit() {
		System.out.println(getName() + "is shown on the screen");

	}

	public void attackUnit() {
		System.out.println(getName() + " attaks dealing " + getDamage());

	}

	public void infoUnit() {
		System.out.println(getName() + "has the following utility score :  " + getUtilityRate());

	}

}