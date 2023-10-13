
public class CruiseShip extends Ship{
	
	private int maxOcc;
	
	//No-arg constructor for CruiseShip class
	public CruiseShip() {
		maxOcc = 0;
	}
	
	/* Constructor for the CruiseShip class. Sets all fields.
	 * */
	public CruiseShip(String n, String ym, int max) {
		
		maxOcc = max;
		setName(n);
		setYearMade(ym);
		
	}
	
	/*Copy constructor for CruiseShip class. 
	 * Copies the fields of the passed object into the calling object's fields.
	 * @param cs is a CruiseShip object that's passed and assigns fields to calling object.
	 * */
	public CruiseShip(CruiseShip cs) {
		
		this.maxOcc = cs.maxOcc;
		this.setName(cs.getName());
		this.setYearMade(cs.getName());
		
	}
	
	/* Mutator method for the CruisShip class. Sets the maximum occupancy of passengers.
	 * @param max is passed and assigned to maxOcc. 
	 * */
	public void setMax(int max) {
		
		maxOcc = max;
	}
	
	/* Accessor method for the CruiseShip class. Returns the number of maximum passengers
	 * */
	public int getMax() {
		
		return maxOcc;
	}
	
	
	/* Overridden toString method. Returns a string representation of the class. 
	 * */
	@Override
	public String toString() {
		
		String str = "Ship Name: " + getName() + "\nYear Name: " + getYearMade() + 
				"\nCapacity: " + getMax()  ;
		return str;
		
	}
	
	
}
