class demo extends Thread {
    int i = 0;

    @Override
    public void run() {
        while (i < 100) {
            System.out.println("Patil");
            i++;
        }
    }
}

public class thread extends Thread {
    int i = 0;

    @Override
    public void run() {
        while (i < 100) {
            System.out.println("Jayesh");
            i++;
        }
    }

    public static void main(String[] args) {
        thread t = new thread();
        demo d = new demo();
        t.start();
        try {
            t.join(); // Ensures "Jayesh" completes before "Patil" starts
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        d.start();
    }
}
