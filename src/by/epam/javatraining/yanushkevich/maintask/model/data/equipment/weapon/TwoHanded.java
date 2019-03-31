package by.epam.javatraining.yanushkevich.maintask.model.data.equipment.weapon;

public class TwoHanded extends Weapon{
	private WeaponType weaponType;

	public enum WeaponType {
		SWORD, AXE, MACE, SPEAR
	}

	public TwoHanded() {
		super("sword", 200, false, 15);
		this.weaponType = WeaponType.SWORD;
	}

	public TwoHanded(String name, int price, boolean magic, int damage, WeaponType weaponType) {
		super(name, price, magic, damage);
		this.weaponType = weaponType;
	}
	public WeaponType getWeaponType() {
		return weaponType;
	}

	public void setWeaponType(WeaponType weaponType) {
		this.weaponType = weaponType;
	}
	
	@Override
	public String toString() {
		return "OneHanded [Name=" + getName() + ", isMagic=" + isMagic() + ", Damage =" + getDamage()
				+ ", weaponType=" + weaponType + ", Price =" + getPrice() + "]";
	}
}
