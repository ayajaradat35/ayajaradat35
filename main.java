package circle;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 circle circle = new circle(2.0, "blue");
	        System.out.println("Circle: Radius = " + circle.getRadius() + ", Area = " + circle.getArea());

	        Cylinder cylinder = new Cylinder(3.0, 4.0, "green");
	        System.out.println("Cylinder: Radius = " + cylinder.getRadius() + ", Height = " + cylinder.getHeight()
	                + ", Volume = " + cylinder.getVolume());
	        
	        Cylinder c1 = new Cylinder();
	        System.out.println("Cylinder:"
	              + " radius=" + c1.getRadius()
	              + " height=" + c1.getHeight()
	              + " base area=" + c1.getArea()
	              + " volume=" + c1.getVolume());
	     
	        // Declare and allocate a new instance of cylinder
	        //   specifying height, with default color and radius
	        Cylinder c2 = new Cylinder(10.0, 0);
	        System.out.println("Cylinder:"
	              + " radius=" + c2.getRadius()
	              + " height=" + c2.getHeight()
	              + " base area=" + c2.getArea()
	              + " volume=" + c2.getVolume());
	     
	        // Declare and allocate a new instance of cylinder
	        //   specifying radius and height, with default color
	        Cylinder c3 = new Cylinder(2.0, 10.0);
	        System.out.println("Cylinder:"
	              + " radius=" + c3.getRadius()
	              + " height=" + c3.getHeight()
	              + " base area=" + c3.getArea()
	              + " volume=" + c3.getVolume());
	     }
	  
	    }
	

	


