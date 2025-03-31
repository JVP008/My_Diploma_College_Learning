interface petanimal
{
    void color();
    void weight();
    void legs();
}
interface wildanimal
{
    void color();
    void weight();
    void legs();
}
class animal implements petanimal,wildanimal
{
    public void color()
    {
        System.out.println("Color of animal is : Black");
    }
    public void weight()
    {
        System.out.println("Weight of animal is : 50kg");
    }
    public void legs()
    {
        System.out.println("Legs of animal is : 4");
    }
}
    public class Assignment6 {
public static void main(String[] args) {
    animal obj = new animal();
    obj.color();
    obj.weight();
    obj.legs();
}
}
