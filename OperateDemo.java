public class OperateDemo {
    int a,b;
    int Sum,Mul,Div,Sub;
    OperateDemo()
    {
        a=4;
        b=5;
    }
    void add()
    {
        Sum = a+b;
        sub(); //Nested methods
    }
    void sub()
    {
        Sub =a-b;
        mul(); //Nested methods
    }
    void mul()
    {
       Mul = a*b;
       div(); //Nested methods
    }
    void div()
    {
        
        Div = a/b;

    }
    void Showme()
    {
        System.out.println("SUM = "+Sum);
        System.out.println("SUB = "+Sub);
        System.out.println("MUL = "+Mul);
        System.out.println("DIV = "+Div);
        
    }
    public static void main(String[] args) {
        OperateDemo o = new OperateDemo();
        o.add(); // this will perform all operations
        o.Showme();
    }
}
