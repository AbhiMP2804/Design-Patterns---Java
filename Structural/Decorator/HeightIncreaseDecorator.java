package Structural.Decorator;

public class HeightIncreaseDecorator extends MarioDecorator {

    public HeightIncreaseDecorator(Character mario) {
        super(mario);
        
    }

    @Override
    public void move()
    {
        super.move();
        System.out.println("Mario is now taller! 📏");
    }
    
}
