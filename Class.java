public class Class {
    int i=10;
    void putdata ()
    {
        System.out.println(i);
    }
    public static void main(String[] args) {
        Class c = new Class();
        c.i = 15;
        c.putdata();
    }
}