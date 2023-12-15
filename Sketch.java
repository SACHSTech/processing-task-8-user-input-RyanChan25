import processing.core.PApplet;
import processing.core.PImage;
import java.util.Random;

public class Sketch extends PApplet {
	
  PImage imgFlower;
	PImage imgGrass;
  PImage imgButterfly;
  PImage imgLawnmower;
  PImage imgDirt;
  PImage imgVolcano;
  PImage imgAnt;
  
  boolean upPressed = false;
  boolean downPressed = false;
  boolean leftPressed = false;
  boolean rightPressed = false;

  float lawnmowerX = 380;
  float lawnmowerY = 300;

  Random myRandom = new Random();
  int intRed = 255;
  int intGreen = 255;
  int intBlue = 255;
  int intAntX = 20;

  String strMessage = "";

  public void settings() {
	// put your size call here
    size(400, 400);
    imgFlower = loadImage("Flower.png");  
    imgGrass = loadImage("Grass.jpg"); 
    imgButterfly = loadImage("Butterfly.png");
    imgLawnmower = loadImage("Lawnmower.png");
    imgDirt = loadImage("Dirt.jpg");
    imgVolcano = loadImage("Volcano.png");
    imgAnt = loadImage("Ant.png");
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(intRed, intGreen, intBlue);
    textSize(16);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  imageMode(CENTER);
    
    if (keyPressed) {
      if (key == 'c') {
        background(255);
      }
    }
    
    noStroke();
    fill(intRed, intGreen, intBlue);
    rect(0, 0, 400, 150);

    noStroke();
    fill(0);
    text(strMessage, 20, 50);

    if (keyCode == BACKSPACE) {
      noStroke();
      fill(intRed, intGreen, intBlue);
      rect(0, 0, 400, 150);
    }

    image(imgDirt, lawnmowerX, lawnmowerY, 30, 30);
    image(imgLawnmower, lawnmowerX, lawnmowerY, 40, 40);
    
    if (keyPressed) {
      int intRandomAntX = myRandom.nextInt(20, 380 + 1);
      intAntX = intRandomAntX;
      image(imgAnt, intAntX, 380, 20, 20);
    }

    if (keyPressed) {
      if (keyCode == SHIFT) {
        image(imgVolcano, 200, 275, 350, 350);
      }
    }

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

  public void mouseClicked(){
    image(imgFlower, mouseX, mouseY, 40, 40);
    
  }
  public void mouseDragged(){
    image(imgGrass, mouseX, mouseY, 40, 40);
  }
  
  public void mouseWheel(){
    image(imgButterfly, mouseX, mouseY, 40, 40);
  }

  public void mousePressed(){
    int intRandomRed = myRandom.nextInt(111, 255 + 1);
    int intRandomGreen = myRandom.nextInt(215, 255 + 1);
    
    intRed = intRandomRed;
    intGreen = intRandomGreen;
  }

  public void keyTyped(){
     strMessage += key;
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
  }
}

