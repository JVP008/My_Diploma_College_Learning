interface Myinterface
{
    void method1();
}
public class Lambdaex
{
static void method2()
{
   Myinterface obj = ()->
   {
    System.out.println("method1");
   };
   Myinterface obj2 = ()->
   {
    System.out.println("method1");
   };
   System.out.println("Method2");
   obj.method1();
   obj2.method1();
}
    public static void main(String[] args) {
    new Lambdaex();
    method2();
    }
}
