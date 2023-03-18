class Computer
{
    public void playMusic()
    {
        System.out.println("playing Music");
    }
    public String getMeapen(int cost)
    {
        if(cost>=10)
        {
        return "Pen";
        }
        else
        {
            return "Nothing";
        }
    }
}



public class methods {
    
    public static void main(String args[])
    {
        Computer obj = new Computer();
        
        obj.playMusic();
        String str = obj.getMeapen(5);
        System.out.println(str);
    }
}
