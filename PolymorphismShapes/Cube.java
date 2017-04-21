public class Cube extends ThreeDimensionalShape
 {  
    private double length;  
    public Cube(double length)
	{ 
        this.length = length; 
    }  
    @Override 
    public double getArea()
	{ 
        return (6 * (length * length));  
    }  
    public double getLength()
	{ 
        return length; 
    }  
    @Override 
    public double getVolume()
	{ 
        return (length * length * length); 
    }  
    @Override 
    public void  printDetails()
	{ 
        System.out.format("Radius: %.1f", getLength()); 
    }  
    @Override 
    public String getClassname()
	{ 
        return "Cube"; 
    } 
} 