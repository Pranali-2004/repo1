interface Method
{
//declare variable as a final
  final int a=10;
  final int b=5;
//declare methods as a public 
  public void Square();
  public void Cube();
}
class Method1 implements Method
{
  public void Square()
  {
    int square=a*a;
    System.out.println("Square of "+a+" is "+square);
  }
  public void Cube()
  {
    int cube=b*b*b;
    System.out.println("Cube of "+b+" is "+cube);
  }
}
class Test
{
  public static void main(String args[])
  {
    Method1 obj=new Method1();
    obj.Square();
    obj.Cube();
  }
}