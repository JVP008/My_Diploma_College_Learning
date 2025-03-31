class Mythread implements Runnable {

    public void run() {
        try {
            for (char c = 'a'; c <= 'z'; c++) {
                System.out.print(c + " ");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

public class MultiThreading implements Runnable {
    int num = 30;

    @Override
    public void run() {
        try {
            for (int i = 1; i <= num; i++) {
                System.out.print(i+ " ");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Mythread t = new Mythread();
        MultiThreading m = new MultiThreading();
        Thread thread1 = new Thread(t);
        Thread thread2 = new Thread(m);
        thread1.start();
        thread2.start();
    }
}