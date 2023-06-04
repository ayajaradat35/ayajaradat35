package circle;

	// Circle.java (Superclass)
	public class circle {
	    private double radius;
	    private String color;

	    public circle() {
	        radius = 1.0;
	        color = "red";
	    }

	    public circle(double radius) {
	        this.radius = radius;
	        color = "red";
	    }

	    public circle(double radius, String color) {
	        this.radius = radius;
	        this.color = color;
	    }

	    public double getRadius() {
	        return radius;
	    }

	    public double getArea() {
	        return Math.PI * radius * radius;
	    }
	}

