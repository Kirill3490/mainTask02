package by.epam.javatraining.yanushkevich.maintask.model.data.equipment.weapon;

import by.epam.javatraining.yanushkevich.maintask.model.data.equipment.Equipment;

public class Weapon extends Equipment{
	private boolean magic;
	private int damage;
	public Weapon() {
		super("sword", 200);
		this.magic = false;
		this.damage = 5;
	}
	
	public Weapon(String name, int price, boolean magic, int damage) {
		super(name, price);
		this.magic = magic;
		this.damage = damage;
	}
	
	public Weapon(Weapon weapon) {
		super(weapon.getName(), weapon.getPrice());
		this.magic = weapon.magic;
		this.damage = weapon.damage;
	}

	public boolean isMagic() {
		return magic;
	}

	public void setMagic(boolean magic) {
		this.magic = magic;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
}
