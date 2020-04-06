package factory;

public class BasicUnitFactory {

	public BasicUnit makeNewUnit(String newChosenUnit) {

		BasicUnit basicUnit = null;

		if (newChosenUnit.equals("H")) {
			return new HopliteUnit();

		} else if (newChosenUnit.equals("S")) {
			return new SwordsmanUnit();
		} else if (newChosenUnit.equals("M")) {
			return new MusketeerUnit();
		} else if (newChosenUnit.equals("B")) {
			return new BarbarianUnit();
		} else {
			return null;
		}

	}

}
