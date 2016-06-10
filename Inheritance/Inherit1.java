class Student  //parent /base //super class
{
int rollno;
String name;
}

//child / sub class
class MCAStudent extends Student
{
void print()
{
	System.out.println("Roll Number  : " + rollno);
	System.out.println("Student Name : " + name);
}
}

class Inherit1
{
public static void main(String args[])
{
MCAStudent st1 = new MCAStudent();
st1.rollno=1234;
st1.name="Ajay";
st1.print();	
}
}


