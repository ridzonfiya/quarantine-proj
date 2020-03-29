import java.util.*;
public class Activities
{
   private boolean smartPhone = false;
   private boolean TV = false;
   private boolean computer = false;
   private boolean Camera = false;
   private boolean NintendoSwitch = false;
   private boolean Netflix = false;

   public String[] possActive = {"","","","","","",""};

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

   public void setNintendoSwitch(boolean dap)
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
           possActive[0] = "Watch Netflix";
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
           possActive[1] = "Video Games";
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
           possActive[2] = "Phone Call";
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
           possActive[3] = "Take Photo";
       }
   }

   public void letPrint()
   {
       Arrays.sort(possActive);
       for(String str : possActive)
       {
           System.out.println(str);
       }
   }

   public Activities()
   {
       smartPhone = false;
       TV = false;
       computer = false;
       Camera = false;
       NintendoSwitch = false;
       Netflix = false;

   }   
}

