import java.util.*;


public class Tester 
{

   public static void main(String [] args)
   {

       Activities Client = new Activities();
       Client.setTV(true);
       Client.setSmartPhone(true);
       Client.setComputer(true);
       Client.setCamera(true);
       Client.setNintendoSwitch(true);
       Client.setNetflix(true);

       Client.testPhoto();
       Client.testNetflix();
       Client.testCall();
       Client.testPlayVidGame();

       System.out.println("\t here are your possible activities");
       Client.letPrint();
   }

}