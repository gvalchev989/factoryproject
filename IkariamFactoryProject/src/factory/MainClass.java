package factory;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicUnitFactory unitFactory = new BasicUnitFactory();
		BasicUnit basicUnit = null;
		Scanner userText = new Scanner(System.in);

		System.out.println("What type of unit would you like to pick?  (H / M / S / B)");

		if (userText.hasNextLine()) {
			String selectedUnit = userText.nextLine();
			basicUnit = unitFactory.makeNewUnit(selectedUnit);
		}
		if (basicUnit != null) {
			doUnitActivities(basicUnit);
		} else {
			System.out.println("Please select a valid key - H , M , S or B so as to omplete the unit selection!");
		}

	}

	public static void doUnitActivities(BasicUnit aBasicUnit) {
		aBasicUnit.displayUnit();
		aBasicUnit.infoUnit();
		aBasicUnit.attackUnit();

	}

}
