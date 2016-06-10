class Voters
{
private int age;

//getter method
	private void getAge()
	{
		if(age >=18)
	System.out.println("voters age : " + age);
		else
	System.out.println("Voter age is not properly set!");
	}
//setter method
	void setAge(int a)
		{
			if(a >=18)
			age=a;
			else
			System.out.println("wrong age must be >=18");
		}
}
