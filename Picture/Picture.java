
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square wall1;
    private Square wall2;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle sun2;
    private Square window1;
    
    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        this.draw();
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveVertical(80);
        wall.moveHorizontal(50);
        wall.changeSize(100);
        wall.makeVisible();
        
        wall2 = new Square();
        wall2.moveVertical(350);
        wall2.moveHorizontal(-60);
        wall2.changeSize(600);
        wall2.makeVisible();
        wall2.changeColor("green");
        
        wall1 = new Square();
        wall1.moveVertical(150);
        wall1.changeSize(200);
        wall1.makeVisible();
        wall1.changeColor("blue");
        
        
        wall1 = new Square();
        wall1.moveVertical(200);
        wall1.moveHorizontal(200);
        wall1.changeSize(150);
        wall1.makeVisible();
        wall1.changeColor("blue");
        
         wall2 = new Square();
        wall2.moveVertical(250);
        wall2.moveHorizontal(50);
        wall2.changeSize(100);
        wall2.makeVisible();
        wall2.changeColor("red");
        
         wall2 = new Square();
        wall2.moveVertical(260);
        wall2.moveHorizontal(220);
        wall2.changeSize(90);
        wall2.makeVisible();
        wall2.changeColor("black");

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(60);
        window.moveVertical(100);
        window.makeVisible();
        

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(120);
        window.moveVertical(200);
        window.makeVisible();
        
        roof = new Triangle();
        roof.changeSize(120,50);
        roof.moveHorizontal(465);//tree
        roof.moveVertical(25);
        roof.makeVisible();
        roof.changeColor("green");
        
        roof = new Triangle();
        roof.changeSize(150,70);
        roof.moveHorizontal(465);//tree
        roof.moveVertical(105);
        roof.makeVisible();
        roof.changeColor("green");
        
        roof = new Triangle();
        roof.changeSize(150,80);
        roof.moveHorizontal(465);//tree
        roof.moveVertical(205);
        roof.makeVisible();
        roof.changeColor("green");
        
        window = new Square();
        window.changeColor("black");//tree
        window.moveHorizontal(440);
        window.moveVertical(320);
        window.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(40);
        window.moveVertical(200);
        window.makeVisible();
        

        roof = new Triangle();
        roof.changeSize(50, 140);
        roof.moveHorizontal(110);
        roof.moveVertical(70);
        roof.makeVisible();
        roof.changeColor("blue");

        roof = new Triangle();
        roof.changeSize(80,180);
        roof.moveHorizontal(290);
        roof.moveVertical(165);
        roof.makeVisible();
        roof.changeColor("red");

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(280);
        sun.moveVertical(-20);//sun
        sun.changeSize(60);
        sun.makeVisible();
        
        sun2=new Circle();
        sun2.changeColor("blue");
        sun2.moveHorizontal(350);//pond
        sun2.moveVertical(350); 
        sun2.changeSize(160);
        sun2.makeVisible();
        
        sun2=new Circle();
        sun2.changeColor("black");
        sun2.moveHorizontal(380);//duck
        sun2.moveVertical(420);
        sun2.changeSize(30);
        sun2.makeVisible();
        
        window1 = new Square();
        window1.changeColor("black");
        window1.moveHorizontal(350);//duck
        window1.moveVertical(450);
        window1.makeVisible();
        sun2=new Circle();
        
        sun2.changeColor("black");
        sun2.moveHorizontal(430);
        sun2.moveVertical(420);
        sun2.changeSize(30);//duck
        sun2.makeVisible();
        
        window1 = new Square();
        window1.changeColor("black");//duck
        window1.moveHorizontal(400);
        window1.moveVertical(450);
        window1.makeVisible();

    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
