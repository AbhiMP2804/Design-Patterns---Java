
package Structural.Decorator;

class FlyDecorator extends MarioDecorator
{

    public FlyDecorator(Character mario) {
            super(mario);
            
        }
    
        @Override
    public void move() {
        
        super.move();
        System.out.println("Mario can now fly! ✈️");
    }

}