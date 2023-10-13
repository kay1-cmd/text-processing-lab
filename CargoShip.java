
public class CargoShip extends Ship {
	int capacity;
		
		
		//No-arg cosntructor
		public CargoShip() {
			
			capacity = 0;
			
		}
		
		//Class constructor
		public CargoShip(String n, String ym, int cap ) {
			
			setName(n);
			setYearMade(ym);
			capacity = cap;
			
			
		}
		
		/*Copy cosntructor for CargoShip class
		 * @param cs is a CargoSHip object passed. 
		 * Contents of class are copied to calling object.
		 * */
		public CargoShip(CargoShip cs) {
			
			this.capacity = cs.capacity;
			setName(cs.getName());
			setYearMade(cs.getYearMade());
			
		}
		
		
		/*Mutator method for capacity field
		 * @param cap is passed and set to capacity.
		 * */
		public void setCap(int cap){
			
			capacity = cap;
		}
		
		
		/*Accessor method for capacity field
		 * */
		public int getCap() {
			
			return capacity;
		}
		
		/* Programmer defined toString for CargoShip class*/
		@Override
		public String toString() {
			String str = "Ship Name: " + getName() + "\nYear Name: " + getYearMade() + 
					"\nCapacity: " + getCap()  ;
			return str;
		}
}
