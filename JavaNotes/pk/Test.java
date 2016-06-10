package mypackage;

//import mypackage.spaatcom.Course;

//import mypackage.spaatcom.Course;

//import mypackage.spaatcom.CourseBCA;

//import mypackage.spaatcom.CourseMCA;


import mypackage.spaatcom.*; //all classes and interface from spaatcom package

class Test
{
public static void main(String args[])
{
	System.out.println("Welcome User!!!");

	mypackage.spaatcom.Course obj = new mypackage.spaatcom.Course();
	obj.CourseList();

	mypackage.spaat.Course obj2 = new mypackage.spaat.Course();
	obj2.CourseList();

}
}
