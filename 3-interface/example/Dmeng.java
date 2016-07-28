class Dmeng implements VideoCard
{
    String name;
    public Dmeng()
    {
       name="Dmeng's videocard";
    }
    public void setName(String name)
    {
       this.name=name;
    }
    public void Display()
    {
       System.out.println("Dmeng's videocard is working");
    }
    public String getName()
    {
       return name;
    }
}
