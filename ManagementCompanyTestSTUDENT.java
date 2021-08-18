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
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ManagementCompanyTestSTUDENT {
	Property r1,r2,r3,r4,r5,r6,r7;
	ManagementCompany r ; 
	
	
	@Before
	public void setUp() throws Exception {
		//student create a management company
		r1 = new Property ("New Heaven", "Forestdale", 4500.00, "Rebecca B.",1,1,5,2);
		r2 = new Property ("Fortress", "SilverSpring", 6200.00, "Tiffani H.",2,2,3,6);
		r3 = new Property ("Florence", "Broadbirch", 3500.00, "Vanita P.",3,2,5,2);
		r4 = new Property ("Queendom", "Beltsville", 4900.00, "Yeni S.",4,6,5,2);
		//student add three properties, with plots, to mgmt co
		r= new ManagementCompany("FlintStone", "8182367",6);
		
		r.addProperty(r1);
		r.addProperty(r2);
		r.addProperty(r3);
		r.addProperty(r4);
		
		
	}

	@After
	public void tearDown() {
		//student set mgmt co to null  
		r1=r2=r3=r4=r5=r6=r7=null;
		r=null;
	}

	@Test
	public void testAddPropertyDefaultPlot() {
		
		//student should add property with 4 args & default plot (0,0,1,1)
		//student should add property with 8 args
		//student should add property that exceeds the size of the mgmt co array and can not be added, add property should return -1	
		r5 = new Property ("Libman", "Ocean City", 7500.00, "Priya S.");
		r6 = new Property ("Lysol", "Cansas city", 3200.00, "Ely C.",2,2,3,6);
		r7 = new Property ("OutOfBound", "Baltimore", 6700.00, "Leslie L.",3,2,5,2);
	}
 
	@Test
	public void testMaxRentProp() {
		//student should test if maxRentProp contains the maximum rent of properties
		assertEquals(r.totalRent(),9400.0,0);
		
	}

	@Test
	public void testTotalRent() {
		
		//student should test if totalRent returns the total rent of properties
		assertEquals(r.maxRentProp(),4900.0,0);
	}

 }