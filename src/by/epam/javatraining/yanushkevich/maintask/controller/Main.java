package by.epam.javatraining.yanushkevich.maintask.controller;

import by.epam.javatraining.yanushkevich.maintask.model.data.Knight;
import by.epam.javatraining.yanushkevich.maintask.model.data.equipment.weapon.OneHanded.WeaponType;
import by.epam.javatraining.yanushkevich.maintask.model.logic.weapon.OneHandedWorker;

public class Main {

	public static void main(String[] args) {
		Knight knight = new Knight();
		System.out.println(knight.getArraySize());
		OneHandedWorker.addOneHandedWeapon(knight, "Sword of desteny", 1000, true, 70, WeaponType.SWORD);
		OneHandedWorker.addOneHandedWeapon(knight, "Axe of desteny", 900, true, 70, WeaponType.AXE);
		OneHandedWorker.addOneHandedWeapon(knight, "Bow of desteny", 1500, true, 70, WeaponType.BOW);
		OneHandedWorker.addOneHandedWeapon(knight, "Sword of darkness", 4000, true, 100, WeaponType.SWORD);
		OneHandedWorker.addOneHandedWeapon(knight, "Sword of chaos", 2000, true, 80, WeaponType.SWORD);
		System.out.println(knight.toString());
		System.out.println(OneHandedWorker.findMostExpensive(knight));
		System.out.println(OneHandedWorker.findOnlySword(knight));
	}

}
