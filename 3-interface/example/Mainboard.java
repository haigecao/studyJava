class Mainboard
{
    String strCPU;
    VideoCard vc;

    void setCPU(String strCPU)
    {
       this.strCPU = strCPU;
    }

    void setVideoCard(VideoCard vc)
    {
       this.vc = vc;
    }

    void run()
    {
       System.out.println(strCPU);
       System.out.println(vc.getName());
       vc.Display();
       System.out.println("Mainboard is running");
    }
}
