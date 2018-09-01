package addresses;

public class IndiaAddress extends GenericAddress {

	protected String state;
	protected String zipcode;

	/**********
	 * Default constructor
	 * 
	 * @return a generic address with all field set to the empty string
	 */
	public IndiaAddress() {
		super();
	}

	
	/**********
	 * Fully-specified constructor
	 * 
	 * @param n - Name
	 * @param a - Address
	 * @param c - City
	 * @param s - State
	 * @param z - zipcode
	 * @param cn - Country Name
	 * 
	 * @return a fully specified United States address
	 */
	public IndiaAddress(String n, String a, String c, String s, String z, String cn) {
		super(n, a, c, cn);
		state = s;
		zipcode = z;
	}
	
	/**********
	 * Overridden toString method for this class showing the values of all of the attributes
	 * 
	 * @return a string formatted to show the address in format appropriate for the United States
	 */
	
	public String toString() {
		return name + "\n" + address  + "\n" + city + ", " + state + " " + zipcode + "\n" + country;
	}

	
	
}
