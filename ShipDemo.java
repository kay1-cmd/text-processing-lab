import java.util.ArrayList;
/**
 * This program demonstrates the Ship, CruiseShip, and CargoShip classes.
 * @author Nia Jordan
 * September 14, 2022
 * COSC 2436 902
 * */
public class ShipDemo {
	public static void main(String[] args) {
		
		//Create various ship objects
		Ship s1 = new Ship( "SS Jordan", "2000");
		Ship s2 = new Ship(s1);
		CruiseShip cruiseS1 = new CruiseShip("Relax and Sail", "2020", 2000);
		CruiseShip cruiseS2 = new CruiseShip(cruiseS1);
		CargoShip cargoS1 = new CargoShip();
		
		
		//Create Array list to hold  ship objects
		ArrayList<Ship> shipList = new ArrayList<Ship>();
		
		//Set fields of classes
		
		s2.setName("SS Newman");
		
		cruiseS2.setName("Relax and Sail 2");
		cargoS1.setName("Cargo 1");
		cargoS1.setYearMade("2004");
		cargoS1.setCap(160000);
		
		CargoShip cargoS2 = new CargoShip(cargoS1);
		cargoS2.setName("Cargo 2");
		cargoS2.setYearMade("2018");
		cargoS2.setCap(165000);
		
		
		//Add ship objects to array lists
		shipList.add(s1); //0
		shipList.add(s2); // 1
		shipList.add(cruiseS1); //2
		shipList.add(cruiseS2); //3
		shipList.add(cargoS1); //4
		shipList.add(cargoS2); //5
		
		for(Ship s : shipList) {
			System.out.println(s);
			System.out.println();
			
		}
		
		





		
	}

}
