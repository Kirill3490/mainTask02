package by.epam.javatraining.yanushkevich.maintask.model.data.equipment.weapon;

public class OneHanded extends Weapon {
	private WeaponType weaponType;

	public enum WeaponType {
		SWORD, AXE, MACE, BOW
	}

	public OneHanded() {
		super("sword", 50, false, 5);
		this.weaponType = WeaponType.SWORD;
	}

	public OneHanded(String name, int price, boolean magic, int damage, WeaponType weaponType) {
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
