package by.epam.javatraining.yanushkevich.maintask.model.data;

import java.util.Arrays;

import by.epam.javatraining.yanushkevich.maintask.model.data.equipment.weapon.OneHanded;
import by.epam.javatraining.yanushkevich.maintask.model.data.equipment.weapon.TwoHanded;

public class Knight {
	private TwoHanded[] heavyEquipments;
	private OneHanded[] equipments;
	private int arraySize;

	public Knight() {
		this.arraySize = 10;
		this.equipments = new OneHanded[arraySize];
		this.heavyEquipments = new TwoHanded[arraySize];
	}

	public Knight(int arraySize) {
		this.arraySize = arraySize;
		this.equipments = new OneHanded[arraySize];
		this.heavyEquipments = new TwoHanded[arraySize];
	}

	public Knight(Knight knight) {
		this.arraySize = knight.arraySize;
		this.equipments = new OneHanded[knight.arraySize];
		for (int i = 0; i < knight.arraySize; i++) {
			equipments[i] = getEquipment(knight, i);
		}
		
		this.heavyEquipments = new TwoHanded[knight.arraySize];
		for (int i = 0; i < knight.arraySize; i++) {
			heavyEquipments[i] = getHeavyEquipment(knight, i);
		}
	}

	public Knight(OneHanded[] equpment) {
		this.arraySize = equpment.length;
		this.equipments = equpment;
	}

	public OneHanded getEquipment(Knight knight, int index) {
		return knight.equipments[index];
	}

	public OneHanded[] getEquipments() {
		return equipments;
	}

	public void setEquipments(OneHanded[] equipments) {
		this.equipments = equipments;
	}

	public int getArraySize() {
		return arraySize;
	}

	public void setArraySize(int arraySize) {
		this.arraySize = arraySize;
	}

	public boolean isFull() {
		boolean answer = true;
		for (int i = 0; i < arraySize; i++) {
			if (equipments[i] == null) {
				answer = false;
				break;
			}

		}
		return answer;
	}
	
	public TwoHanded[] getSecondEquipments() {
		return heavyEquipments;
	}

	public void setHeavyEquipments(TwoHanded[] heavyEquipments) {
		this.heavyEquipments = heavyEquipments;
	}
	
	public TwoHanded getHeavyEquipment(Knight knight, int index) {
		return knight.heavyEquipments[index];
	}

	@Override
	public String toString() {
		return "Knight equipment " + Arrays.toString(equipments);
	}
}
