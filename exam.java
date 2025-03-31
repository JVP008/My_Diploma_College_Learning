public class exam {
    public static void main(String[] args) {
       String s = "hello!world";
       char[] ch = s.toCharArray();
       char temp;
       int i = 0;
       int l =s.length()-1; 
       while (i<l) 
       {
        temp = ch[i]; 
        ch[i] = ch[l];
        ch[l] = temp;
        i++;
        l--;
       } 
       for (char c : ch)
       {
        System.out.print(c);
       }
    }
}
