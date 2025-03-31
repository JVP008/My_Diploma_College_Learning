
class Parent
 {
   public int age ;
    public Parent(int age) 
      {
        this.age = age;
      }  
    
      public void display1()
      {
          System.out.println("Age of Parent is : " + age);
      }
}
class child extends Parent{
protected String Address;
child (int age,String Address)
{
    super(age);
    this.Address = Address;
}
public void display2()
{
    System.out.println("Address of Parent is : " + Address);
}
}
public class grandchild extends child{

private float weight;

grandchild (int age,String Address,float weight) // parameterized constructor 💀
{
    super(age,Address);
    this.weight = weight;
}
void display3()
{
    System.out.println("Weight of Parent is : " + weight);
}
    public static void main(String[] args) {
    grandchild obj = new grandchild(16,"Bhusawal",49.77f);
     obj.display1();
     obj.display2();
     obj.display3();
    }
}

