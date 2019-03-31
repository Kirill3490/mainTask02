package by.epam.javatraining.yanushkevich.maintask.model.logic.weapon;

import by.epam.javatraining.yanushkevich.maintask.model.data.Knight;
import by.epam.javatraining.yanushkevich.maintask.model.data.equipment.weapon.OneHanded;
import by.epam.javatraining.yanushkevich.maintask.model.data.equipment.weapon.OneHanded.WeaponType;

public class OneHandedWorker {
	public static void addOneHandedWeapon(Knight knight, String name, int price, boolean magic, int damage,
			WeaponType weaponType) {
		OneHanded oneHanded = new OneHanded(name, price, magic, damage, weaponType);
		if (!knight.isFull()) {
			for (int i = 0; i < knight.getArraySize(); i++) {
				if (knight.getEquipments()[i] == null) {
					knight.getEquipments()[i] = oneHanded;
					break;
				}
			}
		}
	}

	public static OneHanded findMostExpensive(Knight knight) {
		OneHanded mostExpensive = new OneHanded();
		OneHanded weapon = new OneHanded();
		for (int i = 0; i < knight.getArraySize(); i++) {
			if (knight.getEquipments()[i] == null) {
				break;
			}
			weapon = knight.getEquipment(knight, i);
			if (weapon.getPrice() > mostExpensive.getPrice()) {
				mostExpensive = weapon;
			}
		}
		return mostExpensive;
	}

	public static OneHanded findLessExpensive(Knight knight) {
		OneHanded lessExpensive = new OneHanded();
		OneHanded weapon = new OneHanded();
		for (int i = 0; i < knight.getArraySize(); i++) {
			if (knight.getEquipments()[i] == null) {
				break;
			}
			weapon = knight.getEquipment(knight, i);
			if (weapon.getPrice() < lessExpensive.getPrice()) {
				lessExpensive = weapon;
			}
		}
		return lessExpensive;
	}

	public static OneHanded findMostDangerOneHandedWeapon(Knight knight) {
		OneHanded mostDangeOneHanded = new OneHanded();
		OneHanded weapon = new OneHanded();
		for (int i = 0; i < knight.getArraySize(); i++) {
			if (knight.getEquipments()[i] == null) {
				break;
			}
			weapon = knight.getEquipment(knight, i);
			if (weapon.getDamage() > mostDangeOneHanded.getDamage()) {
				mostDangeOneHanded = weapon;
			}
		}
		return mostDangeOneHanded;
	}

	public static OneHanded findLessDangerOneHandedWeapon(Knight knight) {
		OneHanded lessDangeOneHanded = new OneHanded();
		OneHanded weapon = new OneHanded();
		for (int i = 0; i < knight.getArraySize(); i++) {
			if (knight.getEquipments()[i] == null) {
				break;
			}
			weapon = knight.getEquipment(knight, i);
			if (weapon.getDamage() < lessDangeOneHanded.getDamage()) {
				lessDangeOneHanded = weapon;
			}
		}
		return lessDangeOneHanded;
	}

	public static Knight findOnlySword(Knight knight) {
		OneHanded[] array = new OneHanded[knight.getArraySize()];
		array = knight.getEquipments();
		int index = 0;
		OneHanded[] changingArray = new OneHanded[knight.getArraySize()];
		for (int i = 0; i < changingArray.length; i++) {
			if (array[i] == null) {
				break;
			} else if (array[i].getWeaponType() == WeaponType.SWORD) {
				changingArray[index] = array[i];
				index++;
			}
		}

		knight.setEquipments(changingArray);

		return knight;
	}
	public static Knight findOnlyBow(Knight knight) {
		OneHanded[] array = new OneHanded[knight.getArraySize()];
		array = knight.getEquipments();
		int index = 0;
		OneHanded[] changingArray = new OneHanded[knight.getArraySize()];
		for (int i = 0; i < changingArray.length; i++) {
			if (array[i] == null) {
				break;
			} else if (array[i].getWeaponType() == WeaponType.BOW) {
				changingArray[index] = array[i];
				index++;
			}
		}

		knight.setEquipments(changingArray);

		return knight;
	}
	public static Knight findOnlyAxe(Knight knight) {
		OneHanded[] array = new OneHanded[knight.getArraySize()];
		array = knight.getEquipments();
		int index = 0;
		OneHanded[] changingArray = new OneHanded[knight.getArraySize()];
		for (int i = 0; i < changingArray.length; i++) {
			if (array[i] == null) {
				break;
			} else if (array[i].getWeaponType() == WeaponType.AXE) {
				changingArray[index] = array[i];
				index++;
			}
		}

		knight.setEquipments(changingArray);

		return knight;
	}
}
