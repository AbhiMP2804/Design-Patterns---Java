package Structural.Decorator;

public class GunDecorator extends MarioDecorator {

    public GunDecorator(Character mario)
    {
        super(mario);
    }

    @Override
    public void move()
    {
        super.move();
        System.out.println("Mario shoots with a gun! 🔫");
    }

}
