interface cam
{
  public void snap();
  default void shutt()
  {
    System.out.println("SHUTTER SOUND");
  }
}
interface  audio{
public void listening();
}

class mob
{
 public void call()
 {
    System.out.println("Calling..");
 }   
}
class smphone extends mob implements audio,cam {
public void touch()
{
    System.out.println("SMART TOUCHABLE PHONE");
} 
public void snap()
 {
    System.out.println("Taking photos");
 }
 public void listening()
 {
    System.out.println("Listening");
 }
 public void shutt()
 {
    System.out.println("F*** YOU");
 }
    
}
public class Interface {
    public static void main(String[] args) {
        smphone s = new smphone();
        s.snap();
        s.shutt();
        s.touch();
    }
}