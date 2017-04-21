public abstract class ThreeDimensionalShape extends Shape
{ 
     private static final String threetype = "Three Dimensional Shape"; 
       
     public abstract double getVolume(); 
     
    @Override 
    public String getType()
	{ 
        return threetype; 
    } 
      
} 