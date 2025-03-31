public class Array {
    public static void main(String[] args) {
         int a[] = new int [10];
         for (int i= 0;i<10;i++)
         {
            a[i] =i;
         }
         System.out.println("EVEN");
         for (int i= 0;i<10;i++) {
            if (i%2 ==0)
            {
                System.out.print(" "+i);
            }
         }
         System.out.println();
         System.out.println("ODD");
         for (int i= 0;i<10;i++)
         {
            if (i%2 ==1)
            {
                System.out.print(" "+i);
            }
         }
    }
    }