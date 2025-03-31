// command line argument
public class cmd
{
    public static void main(String[] args)
    {
        for (int i = 1; i < 10; i++)
        {
            odd(i);
        }
        for (int i = 1; i < 10; i++)
        {
            even(i);
        }
    }

    static void odd(int n1)
    {
        if (n1 % 2 != 0)
        {
            System.out.println(n1);
        }

    }
    static void even(int n)
    {
        if (n % 2 == 0)
        {
            System.out.println(n);
        }
    
}
}

