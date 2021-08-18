/*
 * Class: CMSC203 
 * Assignment 4
 * Instructor: Dr. Grigoriy Grinberg & Prof. Ashique Tanveer
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
	Print your Name here: _Rebecca Beyene_________
 */	
	public class Plot {
		private int x;//The x-value of the upper-left corner of the Plot
		private int y;//The y-value of the upper-left corner of the Plot
		private int width;//The horizontal extent of the Plot
		private int depth;//The vertical extent of the Plot
		
	// No-arg Constructor, creates a default Plot with args x=0, y=0, width=1, depth=1
		public Plot() {
			this.x=0;
			this.y=0;
			this.width=1;
			this.depth=1;
		}
	//Copy Constructor, creates a new object using the information of the object passed to it.
		public Plot(Plot p) {
			this.x=p.x;
			this.y=p.y;
			this.width=p.width;
			this.depth=p.depth;
		}
	//Parameterized Constructor
		public Plot(int x, int y, int width, int depth) {
			this.x=x;
			this.y=y;
			this.width=width;
			this.depth=depth;
		}
	
	//determines if this plot overlaps the parameter,returns true if the two plots overlap,
	//false otherwise
	public boolean overlaps(Plot plot) {
		if ((x < plot.x + plot.width) 
				&& (plot.x < x + width ) 
				&& (y < plot.y + plot.depth)
				&& (plot.y < y + depth ))
			return true;
		else
			return false;
		
	}
	//takes a Plot instance and determines if the current plot contains it.
	//Returns true if this plot encompasses the parameter, false otherwise
	public boolean encompasses(Plot plot) {
		double x2=x+width;
		double y2=y+depth;
		double plotX2=plot.getX()+plot.getWidth();
		double plotY2=plot.getY()+plot.getDepth();
		if((this.x<=plot.getX())&&(x2>=plotX2)&&(this.y<=plot.getY())&&(y2>=plotY2))
			return true;
		else
			return false;
	}
	// Sets the x value
	public void setX(int x) {
		this.x=x;
	}
	//Returns the x value
	public int getX() {
		return x;
	}
	//Sets the y value
	public void setY(int y) {
		this.y=y;
	}
	//Returns the y value
	public int getY() {
		return y;
	}
	//Sets the width value
	public void setWidth(int width) {
		this.width=width;
	}
	//Returns the width value
	public int getWidth() {
		return width;
	}
	//Sets the depth value
	public void setDepth(int depth) {
		this.depth=depth;
	}
	//Returns the depth value
	public int getDepth() {
		return depth;
	}
	//Prints the X,Y of the upper left corner, the width and the depth.
	public String toString() {
		String str="Upper left: (" + x + "," + y + "); Width: " + width + " Depth: " + depth;
		return str;
	}
	}
