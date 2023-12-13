public class towerofhanoi {
    public static void main(String[] args) {
        towerofhanoi obj=new towerofhanoi();
        obj.toh(2, "Source", "Destination", "Helper");
    }

    void toh(int n, String s, String d, String h)
    {
        if(n<=0)
        {
            return;
        }
        else
        {
            toh(n-1, s, h, d);
            System.out.println("Disk  "+n+" move from "+s+" to "+d);
            toh(n-1, h, d, d);

        }
    }
}
