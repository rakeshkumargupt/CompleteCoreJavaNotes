class bank
{
int balanceno;
String holdername;
float balance;
void setdetail(int i,String s,float b)
{
balanceno =i;
holdername =s;
balance =b;
}
void deposit(int amount)
{
balance =balance+amount;
}

void withdraw(int amount)
{
balance =balance-amount;
if(balance<amount)
{System.out.println("no vallue="+no vallue);}
}

}

class test
{
public static void main(String args[])
{
bank obj = new bank(); 
System.out.println("Balance : "+ obj.balance);
obj.deposit(5000);
System.out.println("Balance : "+ obj.balance);
obj.withdraw(1000);
System.out.println("Balance : "+ obj.balance); 

}
}