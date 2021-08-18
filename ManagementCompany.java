/*
 * Class: CMSC203 
 * Instructor: Dr. Grigoriy Grinberg & Prof. Ashique Tanveer
 * Description: The program creates a management company
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: _Rebecca Beyene_________
*/
	public class ManagementCompany {
	//Maximum number of properties that this management company handles is set to 5
	private int MAX_PROPERTY=5;
	private double mgmFeePer;//management fee percentage
	private String name;//Name of the management company
	private Property[]properties;//An array of Property objects
	private String taxID;// tax ID of the management Company
	private int MGMT_WIDTH=10;
	private int MGMT_DEPTH=10;
	private Plot plot;//Plot of the ManagemntCompany
	private String compData;
	
	//getters and setters
	public void setMgmFeePer(double mgmFee) {
		this.mgmFeePer=mgmFee;
	}
	public double getMgmFeePer() {
		return mgmFeePer;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setTaxID(String taxID) {
		this.taxID=taxID;
	}
	public String getTaxID() {
		return taxID;
	}
	public void setPlot(int x, int y, int width, int depth) {
		this.plot= new Plot(x,y,width,depth);
	}
	public Plot getPlot() {
		return plot;
	}
	public int getMGMT_WIDTH() {
		return MGMT_WIDTH;
	}
	public int getMGMT_DEPTH() {
		return MGMT_DEPTH;
	}
	public  int	getMAX_PROPERTY() {
		return MAX_PROPERTY;
	}
	

	
	/*
	 * No-Arg Constructor that creates a ManagementCompany object using empty strings and
	 * the plot set to a Plot with x, y set to 0 , width and depth set to 10.
	 */
	
		public ManagementCompany() {
			this.name="";
			this.taxID="";
			this.mgmFeePer=0;
			this.plot= new Plot(0,0,MGMT_WIDTH,MGMT_DEPTH);
			this.properties=new Property[MAX_PROPERTY];
		}
	/*
	 *  Constructor Creates a ManagementCompany object using the passed information.
	 *  plot is set to a Plot with x, y set to 0 , width and depth set to 10
	 *  @param name
	 *  @param taxID
	 *	@param mgmFee
	 */
		
		public ManagementCompany(String name, String taxID, double mgmFee) {
			this.name=name;
			this.taxID=taxID;
			this.mgmFeePer=mgmFee;
			this.plot= new Plot(0,0,MGMT_WIDTH,MGMT_DEPTH);
			this.properties=new Property[MAX_PROPERTY];
		}
		
	/*
	 * Constructor Creates a ManagementCompany object using the passed information.
	 * @param name
	 * @param taxID
	 * @param mgmFee
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 */
		public ManagementCompany(String name, String taxID, double mgmFee, int x,
				int y, int width, int depth)
		{
			this.name=name;
			this.taxID=taxID;
			this.mgmFeePer=mgmFee;
			this.plot= new Plot(x,y,MGMT_WIDTH,MGMT_DEPTH);
			this.properties=new Property[MAX_PROPERTY];	
		}
	
	/*
	 * Copy Constructor that creates a ManagementCompany object from another
	 * ManagementCompany object
	 * @param otherCompany
	 */
		public ManagementCompany(ManagementCompany otherCompany) {
			this.name=otherCompany.name;
			this.taxID=otherCompany.taxID;
			this.mgmFeePer=otherCompany.mgmFeePer;
			this.plot= new Plot(otherCompany.plot);
			this.properties=new Property[MAX_PROPERTY];	
		}
	/* Creates a property object by copying from another property and adds it to the 
	 * "properties" array.
	 * @param property
	 */
		public int addProperty(Property property) {
			// returns -2 if property is null
			if (property==null) {
				return -2;
			}
			// returns -3 if the plot is not contained by the MgmtCo plot
			if(!plot.encompasses(property.getPlot())) {
				return -3;
			}
			// returns -4 of the plot overlaps any other property
			for (int i=0;i<properties.length;i++) {//goes through every element of properties
				if(properties[i]!=null) {// checks that the value is not null
					if (properties[i].getPlot().overlaps(property.getPlot())) {//and compares the plots
						return -4;// returns -4 if it overlaps
					}
				}
			//returns  the index in the array where the property was added successfully
					else {
						properties[i]=property;
						return i;
					}
				}
			
			// Returns either -1 if the array is full
			return -1;
		}
				
	/*
	 * Creates a property object with a default plot and adds it to the "properties" array.
	 * @param name
	 * @param city
	 * @param rent
	 * @param owner
	 */
		public int addProperty(String name,String city,double rent,String owner) {
			//Creates a property object
			Property property=new Property(name, city, rent, owner);
			//adds it to the "properties" array, in a default plot.
			return addProperty(property);
		}

	/*
	 * Creates a property object and adds it to the "properties" array.
	 * @param name
	 * @param city
	 * @param rent
	 * @param owner
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 */
		public int	addProperty( String name, String city, double rent, String owner, 
				int x, int y, int width, int depth){
		//Creates a property object
		Property property= new Property(name,city,rent,owner,x,y,width,depth);
		//adds it to the "properties" array, in a default plot.
		return addProperty(property);
		}
		
	/*
	 * Displays the information of the property at index i
	 * @param i
	 */
		public String displayPropertyAtIndex(int i) {
			return properties[i].toString();
		}
	
	// This method finds a property within the properties array that has the
	//maximum rent amount and returns the rent amount.
		public double maxRentProp() {
			int i=maxRentPropertyIndex();
			return properties[i].getRentAmount();
		}
	//This method finds the index of the property with the maximum rent amount.
		private int	maxRentPropertyIndex() {
			int highest=0;
			for(int i=1; i<properties.length;i++) {
				if (properties[i]==null) {
					break;
				}
				else if (properties[i].getRentAmount()>properties[highest].getRentAmount()) {
					highest=i;
				}
					
			}
		return highest;
		}
	//Displays the information of all the properties in the "properties" array.
		public String toString() {
		String j="";
		for (Property p:properties) {
			if (p==null) {
					break;
				}
			else
			j+="\nProperty Name:"+p.getPropertyName()+"\n Located in "+p.getCity()
			+"\n Belonging to:"+p.getOwner()+"\n Rent Amount: "+p.getRentAmount();
			}
		String str="List of the properties for " + name + ", taxID: " + taxID +
				"\n____________________________________"+j+
				"\n____________________________________\ntotal management Fee: "
				+(totalRent()*mgmFeePer/100);
		
		
			return str;
		}
	//This method accesses each "Property" object within the array "properties" and
	//sums up the property rent and returns the total amount.
		public double totalRent() {
			double total=0;
			for (int i=0; i<properties.length;i++) {
				if(properties[i]!=null) {
					total+=properties[i].getRentAmount();
				}
				else
					break;
			}
			return total;
		}
	
	}
