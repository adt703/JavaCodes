import java.lang.Math;

public class RegularTetrahedron extends ThreeDimensionalShape
 {  
    private double length;  
    public RegularTetrahedron(double length)
	{ 
        this.length = length; 
    }  
    @Override 
    public double getArea()
	{ 
        return (Math.sqrt(3) * (length * length));  
    }  
    public double getLength()
	{ 
        return length; 
    }  
    @Override 
    public double getVolume()
	{ 
        return (1 / (6 * Math.sqrt(2))) * (length * length * length); 
    }  
    @Override 
    public void printDetails()
	{ 
        System.out.format("Length: %.1f", getLength()); 
    }  
    @Override 
    public String getClassname()
	{ 
        return "RegularTetrahedron"; 
    } 
}   