class Parent 
{
void message() 
{
System.out.println("This is the Parent Class");
}
}
class Child extends Parent 
{
void message() {
System.out.println("This is the Child Class");
 }
}
public class Overriding {
public static void main(String[] args) 
{
Child Ch = new Child();
Ch.message();
}
}