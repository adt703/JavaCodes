import java.lang.Math;

public class Triangle extends TwoDimensionalShape
 {  
    public double f1edge; 
    public double f2edge; 
    public double f3edge; 
    public double tot;  
    Triangle(double f1edge, double f2edge, double f3edge)
	{ 
        this.f1edge = f1edge; 
        this.f2edge = f2edge; 
        this.f3edge = f3edge; 
        tot = f1edge + f2edge + f3edge; 
    } 
	
    @Override 
    public double getArea()
	{ 
        return Math.sqrt(tot * (tot - f1edge) * (tot - f2edge) * (tot - f3edge)); 
    } 
	
    @Override 
    public void printDetails()
	{ 
        System.out.format("First edge:  %.1f, Second edge:  %.1f, Third edge:  %.1f  ", getf1(), getf2(), getf3());  
    } 
	
    public double getf1()
	{ 
        return f1edge; 
    }  
    public double getf2()
	{ 
        return f2edge; 
    }  
    public double getf3()
	{ 
        return f3edge; 
    }

	@Override 
    public String getClassname()
	{ 
        return "Triangle"; 
    }
}