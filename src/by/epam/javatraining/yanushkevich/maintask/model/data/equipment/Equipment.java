package by.epam.javatraining.yanushkevich.maintask.model.data.equipment;

public class Equipment {
	private String name;
	private int price;

	public Equipment() {
		this.name = "training sword";
		this.price = 100;
	}

	public Equipment(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public Equipment(Equipment equipment) {
		this.name = equipment.name;
		this.price = equipment.price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
