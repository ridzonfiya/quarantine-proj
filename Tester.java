import java.util.*;

 
 public class Tester 
{

    public static void main(String [] args)
    {

        Activities Client = new Activities();
        Client.setSmartPhone(true);
        Client.testPhoto();
        System.out.println("\t here are your possible activities");
        for(int x = 0; x < possActive.size(); x++)
        {
            System.out.println(possActive.get(x));
        }
    }

 }