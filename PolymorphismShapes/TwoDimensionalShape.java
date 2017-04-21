public abstract class TwoDimensionalShape extends Shape
{  
    private static final String shapetype = "Two Dimensional Shape";  
    public abstract double getArea(); 
	
    @Override 
    public String getType()
	{ 
        return shapetype; 
    } 
}   