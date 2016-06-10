class function11
{

public static void main(String args[])
	{
	int p=5;
	int r=10;
	int t=6;
int z=0;
	//to call the function and store the return value
	//in z variable
	z = percentage_digits(p,r,t);
	System.out.println("z = " + z);
	p=100;r=20;t=10;
	z = percentage_digits(p,r,t);
	System.out.println("z = " + z);
	}

//Declaration /definition of function to sum data

static int percentage_digits(int p, int r,int t)
{
	int z = 0;

	if(p >r&&p>t)
	z = (p*r*t)/100;
	else if(p<r&&p<t)
	z = (r*t)/100;
	else if(p==r&&p==t)
	z = p^3/100;
	return z;
}

}
