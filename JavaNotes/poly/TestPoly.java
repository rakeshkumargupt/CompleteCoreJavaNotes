class Shape
{
void display()
{
System.out.println("I m a shape...");
}
}

class Rectangle extends Shape
{
void display()
{
System.out.println("I m a rectangle...");
}
}

class Circle extends Rectangle
{
void display()
{
System.out.println("I m a circle...");
}
}

class Triangle extends Shape
{
void display()
{
System.out.println("I m a triangle...");
}
}

class TestPoly
{
public static void main(String args[])
{
	Shape obj; // reference variable

	obj = new Shape();
	obj.display();

	obj = new Rectangle();
	obj.display();

	obj = new Circle();
	obj.display();

	obj = new Triangle();
	obj.display();

	obj = new Shape();
	obj.display();
}
}