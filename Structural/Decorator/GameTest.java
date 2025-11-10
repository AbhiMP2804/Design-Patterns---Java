package Structural.Decorator;

public class GameTest {
    public static void main(String[] args) {
        Character mario = new BasicMario();

        mario = new FlyDecorator(mario);
        mario = new GunDecorator(mario);
        mario = new HeightIncreaseDecorator(mario);

        mario.move();
    }
    
}
