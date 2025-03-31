class Runable2 implements Runnable {
    public void run() {
        int i = 0;
        while (i<20) {
            System.out.println("BY");
            i++;
        }
    }
}
public class Runable implements Runnable {
    public void run() {
        int i = 0;
        while (i<20) {
            System.out.println("HI");

            i++;  

        }
    }    
    

    public static void main(String[] args) {
    Runable r = new Runable();
    Runable2 R = new Runable2();    
    Thread t1 = new Thread(r);
    Thread t2 = new Thread(R);
    t1.start();
    t2.start();
    }
}
