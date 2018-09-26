import processing.sound.*;

SinOsc sineWaves; 
float sineFreq; 
float offset = 0.0;

void setup() {  
  frameRate(30);
  float sineVolume = 1.0;
  sineWaves = new SinOsc(this);
  sineWaves.play();
  sineWaves.amp(sineVolume);
}

void draw() {
  float frequency = offset;
  sineWaves.freq(frequency);
  println(offset, frequency);
  offset=(offset <= 40000)?offset+1.:0.0;
}
