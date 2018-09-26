import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import processing.sound.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class frequency_generator extends PApplet {



SinOsc sineWaves; 
float sineFreq; 
float offset = 0.0f;

public void setup() {  
  frameRate(30);
  float sineVolume = 1.0f;
  sineWaves = new SinOsc(this);
  sineWaves.play();
  sineWaves.amp(sineVolume);
}

public void draw() {
  float frequency = offset;
  sineWaves.freq(frequency);
  println(offset, frequency);
  offset=(offset <= 40000)?offset+1.f:0.0f;
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "frequency_generator" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
