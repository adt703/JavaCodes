public class mainClass
{
	public static void main(String[] args)
	{
		Circle circle01 = new Circle(2.5);
		Circle circle02 = new Circle(1.0);
		Square square01 = new Square(2.0);
		Triangle triangle01 = new Triangle(1.5,2.0,2.5);
		Triangle triangle02 = new Triangle(1.0,1.0,1.0);
		Sphere sphere01 = new Sphere(1.5);
		Sphere sphere02 = new Sphere(2.0);
		Cube cube01 = new Cube(1.5);
		RegularTetrahedron regTetrahedron01 = new RegularTetrahedron(1.5);
		RegularTetrahedron regTetrahedron02 = new RegularTetrahedron(2.0);

		Shape[] shapes = new Shape[10];

		shapes[0] = circle01;
		shapes[1] = circle02;
		shapes[2] = square01;
		shapes[3] = triangle01;
		shapes[4] = triangle02;
		shapes[5] = sphere01;
		shapes[6] = sphere02;
		shapes[7] = cube01;
		shapes[8] = regTetrahedron01;
		shapes[9] = regTetrahedron02;

		for (Shape presentShape : shapes)
		{

			if (presentShape instanceof Circle)
			{
				System.out.format("Class name: %s ", presentShape.getClassname());

			}
			else if (presentShape instanceof Square)
			{
				System.out.format("Class name: %s ", presentShape.getClassname());

			}
			else if (presentShape instanceof Triangle)
			{
				System.out.format("Class name: %s ", presentShape.getClassname());

			}
			else if (presentShape instanceof Sphere)
			{
				System.out.format("Class name: %s ", presentShape.getClassname());
			}
			else if (presentShape instanceof Cube)
			{
				System.out.format("Class name: %s ", presentShape.getClassname());

			}
			else if (presentShape instanceof RegularTetrahedron)
			{
				System.out.format("Class name: %s ,", presentShape.getClassname());
			}

			presentShape.printDetails();

			System.out.println();

			System.out.format("Shape Type: %s ", presentShape.getType());

			if (presentShape instanceof TwoDimensionalShape)
			{
				TwoDimensionalShape shape = (TwoDimensionalShape) presentShape;
				System.out.format("- Area: %.2f %n", shape.getArea());
			}
			else if (presentShape instanceof ThreeDimensionalShape)
			{
				ThreeDimensionalShape shape = (ThreeDimensionalShape) presentShape;
				System.out.format("- Area: %.2f,  Volume: %.2f %n", shape.getArea(),shape.getVolume());
			}
			System.out.println();

		}

	}

}
