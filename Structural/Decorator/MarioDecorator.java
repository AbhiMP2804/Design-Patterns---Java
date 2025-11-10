package Structural.Decorator;

public abstract class MarioDecorator implements Character{
    protected Character mario;

    public MarioDecorator(Character mario)
    {
        this.mario=mario;
    }

    @Override
    public void move()
    {
        mario.move();
    }
    

}
