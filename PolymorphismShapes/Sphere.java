import java.lang.Math;

public class Sphere extends ThreeDimensionalShape
 {  
    private double radius;  
    public Sphere(double radius)
	{ 
        this.radius = radius; 
    }  
    @Override 
    public double getArea() { 
        return (Math.PI*(radius * radius)*4);  
    }  
    @Override 
    public double getVolume()
	{ 
        return (4 / 3) * 3.142 * (radius * radius * radius); 
    }  
    public double getRadius()
	{ 
        return radius; 
    }  
	
    @Override 
    public void printDetails()
	{ 
        System.out.format("Radius: %.1f", getRadius()); 
    }  
	
    @Override 
    public String getClassname()
	{ 
        return "Sphere"; 
    }  
} 