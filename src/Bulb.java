public class Bulb
{
    private String bulb_on;
    private String bulb_off;

    public Bulb(String bulb_on, String bulb_off)
    {
        this.bulb_on = bulb_on;
        this.bulb_off = bulb_off;
    }

    public String getBulb_on()
    {

        return bulb_on;
    }

    public void setBulb_on(String bulb_on)
    {
        this.bulb_on = bulb_on;
    }

    public String getBulb_off()
    {
        return bulb_off;
    }

    public void setBulb_off(String bulb_off)
    {
        this.bulb_off = bulb_off;
    }


    public void bulbisOn() {

        System.out.println("bulb is on");
    }

    public void bulbisOff() {

        System.out.println("bulb is off");
    }

    public static void main(String args[])
    {
        Switch switch1=new Switch("press",false);
        boolean result=switch1.getSwitchvalue();
        Bulb bulb=new Bulb("Tube","white");
        if(result)
        {
            bulb.bulbisOn();
        }
        else
        {
            bulb.bulbisOff();
        }
    }
}
