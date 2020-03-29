import.java.util.*;
public class Activities{

    private boolean smartPhone = false;
    private boolean TV = false;
    private boolean computer = false;
    private boolean Camera = false;
    private boolean NintendoSwitch = false;

    public void setTV(boolean dap)
    {
        TV = dap;
    }
    public void setSmartPhone(boolean dap)
    {
        TV = dap;
    }
    public void setComputer(boolean dap)
    {
        TV = dap;
    }
    public void setCamera(boolean dap)
    {
        TV = dap;
    }
    public void setNintendoSwitch(boolean dap)
    {
        TV = dap;
    }
    public boolean canNetflix()
    {
        if(TV == true || computer || true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    ArrayList<String> possActive = new ArrayList<String>;
    public Activities()
    {
        smartPhone = false;
        TV = false;
        computer = false;
        Camera = false;
        NintendoSwitch = false;

    }

}



public class Tester 
{
public static void main(String [] args)
{
    Activities Priyanka = new Activities();
}




// }


// public class next {


// public static void main(String [] args)
// {
//     public next()
//     {

//     }
// }

// }