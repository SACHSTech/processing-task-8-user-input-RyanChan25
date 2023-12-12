import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
	
  PImage imgFlower;
	PImage imgGrass;
  PImage imgButterfly;
  PImage imgLawnmower;
  
  boolean upPressed = false;
  boolean downPressed = false;
  boolean leftPressed = false;
  boolean rightPressed = false;


  float lawnmowerX = 420;
  float lawnmowerY = 300;
  
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
    imgFlower = loadImage("Flower.png");  
    imgGrass = loadImage("Grass.jpg"); 
    imgButterfly = loadImage("Butterfly.png");
    imgLawnmower = loadImage("Lawnmower.png");
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255);

  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  imageMode(CENTER);
    image(imgLawnmower, lawnmowerX, lawnmowerY, 40, 40);

    if (upPressed) {
      lawnmowerY--;
    }
    if (downPressed) {
      lawnmowerY++;
    }
    if (leftPressed) {
      
      lawnmowerX--;
    }
    if (rightPressed) {
      lawnmowerX++;
    }

    
}  
  
  
  // define other methods down here.

  public void mouseClicked(){
    image(imgFlower, mouseX, mouseY, 40, 40);
    
  }
  public void mouseDragged(){
    image(imgGrass, mouseX, mouseY, 40, 40);
  }
  
  public void mouseWheel(){
    image(imgButterfly, mouseX, mouseY, 40, 40);
  }

  

  public void keyPressed() {
    if (keyCode == UP) {
      upPressed = true;
    }
    else if (keyCode == DOWN) {
      downPressed = true;
    }
    else if (keyCode == LEFT) {
      leftPressed = true;
    }
    else if (keyCode == RIGHT) {
      rightPressed = true;
    }

    
  }

  public void keyReleased() {
    if (keyCode == UP) {
      upPressed = false;
    }
    else if (keyCode == DOWN) {
      downPressed = false;
    }
    else if (keyCode == LEFT) {
      leftPressed = false;
    }
    else if (keyCode == RIGHT) {
      rightPressed = false;
    }
    image(imgLawnmower, lawnmowerX, lawnmowerY, 40, 40);



  }
}

