import java.net.*;

public class PracaticalNo24 {
    public static void main(String[] args) {
        try{
            @SuppressWarnings("deprecation")
            URL url = new URL("http://www.msbte.org.in");
            // System.out.println(url.getPath());
            // System.out.println(url.getAuthority());
            System.out.println(url.getHost());
            System.out.println(url.getFile());
            System.out.println(url.getProtocol());
            System.out.println(url.getPort());

        }
        catch(MalformedURLException e )
        {
            System.out.println(e.getMessage());
        }
    }
}
