package by.epam.javatraining.yanushkevich.maintask.model.data.equipment.armor;

public class LightArmor extends Armor {
	enum ArmorType {
		CHAIN_MAIL, LEATHER
	}

	private ArmorType armorType;

	public LightArmor() {
		super("leather", 600, false, 4);
		this.armorType = ArmorType.LEATHER;
	}

	public LightArmor(String name, int price, boolean magic, int defence, ArmorType armorType) {
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
