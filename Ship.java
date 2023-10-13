/* This class is a parent class for ship sub-types.
 *  It stores general data and operates general functions.
 * */
public class Ship {
	
	
	private String name;
	private String yearMade;
	
	
	//No-arg constructor
	public Ship() {
		
		name = " ";
		yearMade = " ";
		
	}
	
	
	/* Regular constructor. Assigns the fields of the class.
	 * @param n is passed and assigned to name 
	 * @param ym is passed and assigned to yearMade
	 * */
	public Ship(String n, String ym) {
		
		name = n;
		yearMade = ym;
		
	}
	
	
	/* Copy constructor for the Ship class.
	 * @param s is a Ship object passed.
	 * */
	public Ship(Ship s) {
		
		this.name = s.name;
		this.yearMade = s.yearMade;
		
	}
	
	
	/* Mutator method for Ship class. Sets the name field.
	 * @param n is passed and assigned to name.
	 * */
	public void setName(String n) {
		
		name = n;
	}
	
	
	/*Mutator method for Ship class. Sets the year made field.
	 * @param ym is passed and assigned to yearMade.
	 * */
	public void setYearMade(String ym) {
		yearMade = ym;
	}
	
	
	/* Accessor method for Ship class. Returns the value in name field.
	 * */
	public String getName() {
		
		return name;
	}
	
	
	/*Accessor method for Ship class. Returns the value in the yearMade field.
	 * */
	public String getYearMade() {
		
		return yearMade;
	}
	
	
	/* Returns a string representation of the class.
	 * */
	@Override
	public String toString() {
		
		String str = "Ship Name: " + name + "\nYear Built: " + yearMade ;
		return str;
	}
	
	
	
	
}
