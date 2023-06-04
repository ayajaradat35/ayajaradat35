package circle;

	// Cylinder.java (Subclass)
	public class Cylinder extends circle {
	    private double height;

	    public Cylinder() {
	        super(); // Invoke superclass' default constructor
	        height = 1.0;
	    }

	    public Cylinder(double radius, double height) {
	        super(radius); // Invoke superclass' constructor with radius parameter
	        this.height = height;
	    }

	    public Cylinder(double radius, double height, String color) {
	        super(radius, color); // Invoke superclass' constructor with radius and color parameters
	        this.height = height;
	    }

	    public double getHeight() {
	        return height;
	    }

	    public double getVolume() {
	        return getArea() * height;
	    }
	}

