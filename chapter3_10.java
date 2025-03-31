public class chapter3_10 {
    public static void main(String[] args)
    {
        // chapter3_10 c = null;
        try
        {
            System.out.println(50/0);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        finally {
        System.gc();
        }
    }
}
