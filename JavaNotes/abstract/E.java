//multiple inheritance using interface
interface A
{
void a();
}
interface B
{
void b();
}

class C implements A, B
{
public void a() { } 
public void b() { }
}