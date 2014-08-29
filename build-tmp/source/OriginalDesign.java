import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

float redAmount = 0.0f;
float blueAmount = 110.0f;
int x = 0;
int i = 0;

public void setup(){
  size(500,500);
  frameRate(10);
}

public void draw() {
  background();
  buildings();
  windows();
  makeStars();
  i++;
  if (i>40){
    noLoop();
  }

}

public void buildings(){
  fill(0);
  stroke(255);
  strokeWeight(2);
  rect(0, 500- 200, 100, 200); 
  rect(100, 500- 300, 100, 300); 
  rect(200, 500- 150, 100, 150); 
  rect(300, 500- 220, 100, 220); 
  rect(400, 500- 180, 100, 180); 
}

public void windows(){
  //fill(255, 224, 23);
  fill(255, 247, 124);
  noStroke();
  int i = 0;
  int y= 310;
    while (i<6){
     rect(7, y, 8, 15);
     rect(27, y, 8, 15);
     rect(47, y, 8, 15);
     rect(67, y, 8, 15);
     rect(87, y, 8, 15);
     i++;
     y= y + 30; 
    }

  i = 0;
  y= 380;
    while (i<5){
     rect(205, y, 8, 15);
     rect(225, y, 8, 15);
     rect(245, y, 8, 15);
     rect(265, y, 8, 15);
     rect(285, y, 8, 15);
     i++;
     y= y + 30; 
    }

  i = 0;
  y= 300;
    while (i<4){
     rect(310, y, 8, 15);
     rect(328, y, 8, 15);
     rect(346, y, 8, 15);
     rect(364, y, 8, 15);
     rect(382, y, 8, 15);
     i++;
     y= y + 30; 
    }

  i = 0;
  y= 370;
    while (i<5){
     rect(415, y, 8, 15);
     rect(435, y, 8, 15);
     rect(455, y, 8, 15);
     rect(475, y, 8, 15);
     rect(495, y, 8, 15);
     i++;
     y= y + 30; 
    }

  i = 0;
  y= 240;
    while (i<4){
     rect(110, y, 8, 15);
     rect(128, y, 8, 15);
     rect(146, y, 8, 15);
     rect(164, y, 8, 15);
     rect(182, y, 8, 15);
     i++;
     y= y + 30; 
    }

  i = 0;
  y= 380;
    while (i<3){
     rect(110, y, 8, 15);
     rect(128, y, 8, 15);
     rect(146, y, 8, 15);
     rect(164, y, 8, 15);
     rect(182, y, 8, 15);
     i++;
     y= y + 30; 
    }
}

public void background(){
 while (x<501){
  stroke(redAmount,0,blueAmount);
  line(0, x, 500, x);
  x=x+1;
  redAmount = redAmount + 0.01f ;
  blueAmount = blueAmount -0.6f ;
  }
}

public void makeStars(){
  int x= (int)(Math.random()*500);
  int y= (int)(Math.random()*250);
  int i = 0;
  fill(255);
     star(x, y, 5, 10, 5);
}

public void star(float x, float y, float radius1, float radius2, int npoints) {
  float angle = TWO_PI / npoints;
  float halfAngle = angle/2.0f;
  beginShape();
  for (float a = 0; a < TWO_PI; a += angle) {
    float sx = x + cos(a) * radius2;
    float sy = y + sin(a) * radius2;
    vertex(sx, sy);
    sx = x + cos(a+halfAngle) * radius1;
    sy = y + sin(a+halfAngle) * radius1;
    vertex(sx, sy);
  }
  endShape(CLOSE);
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
