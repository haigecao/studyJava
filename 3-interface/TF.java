interface Sport
{
    void run();
    void jump();
}

class People {
    People() {
        System.out.println("I'm a people \n");
    }
    public void run() {
        System.out.println("walk \n");
    }
    public void sleep() {
        System.out.println("sleep \n");
    }
}

class Athlete extends People implements Sport
{
    Athlete() {
        System.out.println("Athlete \n");
    }

    public void run()
    {
       System.out.println("短跑");
    }
    public void jump()
    {
       System.out.println("三级跳");
    }

    public static void main(String[] args)
    {
       Athlete zhangsan = new Athlete();

       zhangsan.run();
       zhangsan.jump();
    }
}
