	/*
	 * Class: CMSC203 
	 * Assignment 4
	 * Instructor: Dr. Grigoriy Grinberg & Prof. Ashique Tanveer
	 * Platform/compiler: Eclipse
	 * I pledge that I have completed the programming assignment independently.
	   I have not copied the code from a student or any source.
	   I have not given my code to any student.
	   Print your Name here: _Rebecca Beyene_________
	*/
	public class Property {
	private String city;
	private String owner;
	private String propertyName;
	private double rentAmount;
	private Plot plot;
	/*
	 * No-arg Constructor, creates a new object with default values of empty strings,
	 * 0 for rent amount, and default Plot
	 */
	public Property() {
		this.city=" ";
		this.owner=" ";
		this.propertyName=" ";
		this.rentAmount=0;
		this.plot=new Plot();
	}
	/*
	 * Copy Constructor, creates a new object using the information of the object passed to it.
	 * @param p
	 */
	public Property(Property p) {
		this.city=p.city;
		this.owner=p.owner;
		this.propertyName=p.propertyName;
		this.rentAmount=p.rentAmount;
		this.plot=new Plot(p.plot);
	}
	/*
	 * Constructor, Parameterized constructor with no Plot information (uses default Plot 
	 * where x,y are set to 0, width and depth set to 1)
	 * 
	 * @param propertyName
	 * @param city
	 * @param rentAmount
	 * @param owner
	 */
	public Property(String propertyName, String city,double rentAmount, String owner) {
		this.propertyName=propertyName;
		this.city=city;
		this.rentAmount=rentAmount;
		this.owner=owner;
		this.plot=new Plot();
	}
	/*
	 * Constructor, Parameterized constructor
	 * @param propertyName
	 * @param city
	 * @param rentAmount
	 * @param owner
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 */
	public Property(String propertyName,String city,double rentAmount,String owner,int x,
			int y, int width, int depth) {
		this.propertyName=propertyName;
		this.city=city;
		this.rentAmount=rentAmount;
		this.owner=owner;
		this.plot=new Plot(x,y,width,depth);
	}
	
	
	//Return the property Name
	public String getPropertyName() {
		return propertyName;
	}
	//Set the property name
	public void setPropertyName(String propertyName) {
		this.propertyName=propertyName;
	}
	//return the city
	public String getCity() {
		return city;
	}
	//set the Plot values and returns the Plot for the property
	public Plot setPlot(int x, int y, int width, int depth) {
		return new Plot(x,y,width,depth);
	}
	//set the city
	public void setCity(String city) {
		this.city=city;
	}
	//return the rent amount
	public double getRentAmount() {
		return rentAmount;
	}
	//set the rent amount
	public void setRentAmount(double rentAmount) {
	this.rentAmount=rentAmount;	
	}
	//return the owner name
	public String getOwner() {
		return owner;
	}
	//set the owner name
	public void setOwner(String owner) {
		this.owner=owner;
	}
	//Prints out the name, city, owner and rent amount for a property
	public String toString() {
		String str="Property Name: "+propertyName+"\nLocated in "+city+
				"\nBelonging to: "+owner+"\nRent Amount:"+rentAmount;
		return str;
	}
	// returns the plot
	public Plot getPlot() {
		return plot;
	}
	}
