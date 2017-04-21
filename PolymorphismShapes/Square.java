public class Square extends TwoDimensionalShape
 {  
    private double length;  
    Square(double length)
	{ 
        this.length = length; 
    }  
    @Override 
    public double getArea()
	{ 
        return length * length; 
    }  
    public double getLength()
	{ 
        return length; 
    } 
	
	@Override 
    public void printDetails()
	{ 
        System.out.format("Length: %.1f  ", length); 
    } 
    @Override 
    public String getClassname()
	{ 
        return "Square"; 
    }  
} 