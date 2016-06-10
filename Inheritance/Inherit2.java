class Student  //parent /base //super class
{
int rollno;
String name;
void print()
{
	System.out.println("Roll Number  : " + rollno);
	System.out.println("Student Name : " + name);
}
}

//child / sub class //single level inheritance
class MCAStudent extends Student 
{

}
//Single Level Inheritance //Hierarichical inheritance
class BCAStudent extends Student
{
String course_syllabus;
int fees;
}

//Multi Level Inheritance
class MTech extends BCAStudent
{

}

class Inherit2
{
public static void main(String args[])
{
MCAStudent st1 = new MCAStudent();
st1.rollno=1234;
st1.name="Ajay";
st1.print();	

BCAStudent st2 = new BCAStudent(); 
st2.print();
}
}


