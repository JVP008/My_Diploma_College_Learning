class A{
    void show()
    {
        System.out.println("i am in class A");
    }
    class B
    {
        public  static void show()
        {
           System.out.println("i am in class B"); 
        }
    }
}
public class inside {
    public static void main(String[] args) {
        A a = new A();
        a.show();
        A.B.show();
    }
}
