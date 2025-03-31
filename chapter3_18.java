class  mythread3 extends Thread
{
    @Override
    public  void run()
    {
        int i = 0;
        for (; i < 500; i++) {
            System.out.println("sleeping");
        }

    }
}
public class chapter3_18 extends Thread {
int i =0 ;
    @Override
    public void run() {
        for (int j = 0; j < 500; j++) {
            System.out.println("running");
        }
    }

    public static void main(String[] args) {
        chapter3_18 c = new chapter3_18();
        mythread3 d = new mythread3();
        c.start();
        d.start();
    }
}
