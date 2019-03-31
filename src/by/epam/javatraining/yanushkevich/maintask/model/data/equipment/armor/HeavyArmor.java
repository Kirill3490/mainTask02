package by.epam.javatraining.yanushkevich.maintask.model.data.equipment.armor;

public class HeavyArmor extends Armor{
	enum ArmorType {
		STEEL, PLATE
	}

	private ArmorType armorType;

	public HeavyArmor() {
		super("Stell", 1000, false, 14);
		this.armorType = ArmorType.STEEL;
	}

	public HeavyArmor(String name, int price, boolean magic, int defence, ArmorType armorType) {
		super(name, price, magic, defence);
		this.armorType = armorType;
	}

	public ArmorType getArmorType() {
		return armorType;
	}

	public void setArmorType(ArmorType weaponType) {
		this.armorType = weaponType;
	}

	@Override
	public String toString() {
		return "OneHanded [Name =" + getName() + ", isMagic =" + isMagic() + ", Damage =" + getDamage()
				+ ", armorType =" + armorType + ", Price =" + getPrice() + "]";
	}
}
