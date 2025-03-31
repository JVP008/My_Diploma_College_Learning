
class Library {

    private int No_of_Books = 5;

    synchronized void Issued_no_of_books(int No_of_Books) {

        System.out.println("person '1' wants to Issue " + No_of_Books + " Books");

        if (this.No_of_Books < No_of_Books) {
            try {
                System.out.println("Not Enough Books are Available , Only " + this.No_of_Books + " Books are Available");
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        this.No_of_Books -= No_of_Books;
        System.out.println("You Can Issue Books Now ..... ");
        System.out.println(No_of_Books + " Books are Issued By Person '1'.\nRemaining Books In Liabrary = " + this.No_of_Books);
        System.out.println("\nTHANKS FOR VISITING OUR LIABRARY HAPPY LEARNING.");
        System.out.println();
    }

    synchronized void Return_Books(int No_of_Books) {
        System.out.println("Wait....Person '2' wants to Return " + No_of_Books + " Books");
        this.No_of_Books += No_of_Books;
        System.out.println("So, Now Total Books Available = " + this.No_of_Books);
        notify();
    }

}
public class Assignment_Book_10 {

    public static void main(String[] args) throws  Exception {
        Library library = new Library();
        Thread t1 = new Thread(()-> library.Issued_no_of_books(8));
        Thread t2 = new Thread(() -> library.Return_Books(12));
        System.out.println("Welcome To Patil's Library\n");
        t1.start();
        t2.start();
    }
}
