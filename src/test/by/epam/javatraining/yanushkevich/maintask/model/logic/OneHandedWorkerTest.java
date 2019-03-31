package test.by.epam.javatraining.yanushkevich.maintask.model.logic;

import static org.junit.Assert.*;

import org.junit.Test;

import by.epam.javatraining.yanushkevich.maintask.model.data.Knight;
import by.epam.javatraining.yanushkevich.maintask.model.data.equipment.weapon.OneHanded;
import by.epam.javatraining.yanushkevich.maintask.model.data.equipment.weapon.OneHanded.WeaponType;
import by.epam.javatraining.yanushkevich.maintask.model.logic.weapon.OneHandedWorker;

public class OneHandedWorkerTest {
	OneHanded firstWeapon = new OneHanded("Sword of desteny", 1000, true, 70, WeaponType.SWORD);
	OneHanded secondWeapon = new OneHanded("Axe of desteny", 900, true, 70, WeaponType.AXE);
	OneHanded thirdWeapon = new OneHanded("Bow of desteny", 1500, true, 70, WeaponType.BOW);
	OneHanded fourthWeapon = new OneHanded("Sword of darkness", 4000, true, 100, WeaponType.SWORD);
	OneHanded fifthWeapon = new OneHanded("Sword of chaos", 2000, true, 80, WeaponType.SWORD);
	OneHanded sixthWeapon = new OneHanded("Light Bow", 1300, false, 40, WeaponType.BOW);
	OneHanded[] firstArray = new OneHanded[]{firstWeapon, secondWeapon, thirdWeapon, fourthWeapon, fifthWeapon, sixthWeapon, null};
	Knight knight = new Knight();
	
	

	@Test
	public void testAddOneHandedWeapon() {
		knight.setEquipments(firstArray);
		OneHandedWorker.addOneHandedWeapon(knight, "mace", 30, false, 7, WeaponType.MACE);
		
	}

	@Test
	public void testFindMostExpensive() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindLessExpensive() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindMostDangerOneHandedWeapon() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindLessDangerOneHandedWeapon() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindOnlySword() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindOnlyBow() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindOnlyAxe() {
		fail("Not yet implemented");
	}

}
