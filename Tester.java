public class Tester extends Acitivities
{
    public static void main(String [] args)
    {
        Activities Client = new Activities();
        Client.setSmartPhone(true);
        System.out.println("\tHere are your possible activities");
        for(int x = 0; x < possActive.size(); x++)
        {
            System.out.println(possActive.get(x));
        }
    }
}
