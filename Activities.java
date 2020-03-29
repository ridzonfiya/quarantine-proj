import java.util.*;
public class Activities
{
    private boolean smartPhone = false;
    private boolean TV = false;
    private boolean computer = false;
    private boolean Camera = false;
    private boolean NintendoSwitch = false;
    private boolean Netflix = false;

    public ArrayList<String> possActive;



    public void setTV(boolean dap)
    {
        TV = dap;
    }
    
    public void setSmartPhone(boolean dap)
    {
        smartPhone = dap;
    }
    
    public void setComputer(boolean dap)
    {
        computer = dap;
    }
    
    public void setCamera(boolean dap)
    {
        Camera = dap;
    }
    
    public void setNintedoSwitch(boolean dap)
    {
        NintendoSwitch = dap;
    }
    
    public void setNetflix(boolean dap)
    {
        Netflix = dap;
    }
    
    public boolean canNetflix()
    {
        if(TV == true || computer == true)
        {
            return true;
        }
        else
        {   
            return false;
        }
    }
    
    public void testNetflix()
    {
        if(canNetflix() == true)
        {
            possActive.add("Netflix");
        }
    }
    
    public boolean canPlayVidGame()
    {
        if(NintendoSwitch == true || smartPhone == true)
        {
            return true;
        }
        else
        {   
            return false;
        }
    }
    

    public void testPlayVidGame()
    {
        if(canPlayVidGame() == true)
        {
            possActive.add("VideoGames");
        }
    }
    
    public boolean canCall()
    {
        if(smartPhone == true)
        {
            return true;
        }
        else
        {   
            return false;
        }
    }
    
    public void testCall()
    {
        if(canCall() == true)
        {
            possActive.add("Call");
        }
    }
    
    public boolean canPhoto()
    {
        if(Camera == true || smartPhone == true)
        {
            return true;
        }
        else
        {   
            return false;
        }
    }
    
    public void testPhoto()
    {
        if(canPhoto() == true)
        {
            possActive.add("Photo");
        }
    }
    
    public Activities()
    {
        smartPhone = false;
        TV = false;
        computer = false;
        Camera = false;
        NintendoSwitch = false;
        possActive = new ArrayList<String>();
        
    }   
}
