package by.epam.javatraining.yanushkevich.maintask.model.data.equipment.armor;

import by.epam.javatraining.yanushkevich.maintask.model.data.equipment.Equipment;

public class Armor extends Equipment{
	private boolean magic;
	private int defence;
	
	public Armor() {
		super("leather", 600);
		this.magic = false;
		this.defence = 4;
	}
	
	public Armor(String name, int price, boolean magic, int defence) {
		super(name, price);
		this.magic = magic;
		this.defence = defence;
	}
	
	public Armor(Armor armor) {
		super(armor.getName(), armor.getPrice());
		this.magic = armor.magic;
		this.defence = armor.defence;
	}

	public boolean isMagic() {
		return magic;
	}

	public void setMagic(boolean magic) {
		this.magic = magic;
	}

	public int getDamage() {
		return defence;
	}

	public void setDamage(int defence) {
		this.defence = defence;
	}
}
