package c19403516;

import ddf.minim.AudioBuffer;
import ddf.minim.AudioPlayer;
import ddf.minim.Minim;
import processing.core.PApplet;
import processing.core.PImage;

public class LuisVisual extends PApplet{

    Minim minim;
    AudioBuffer ab;
    AudioPlayer ap;
    PImage img;

    public void settings()
	{
		size(700, 466,P3D);
	}

    public void setup()
    {
        minim=new Minim (this);
        ap=minim.loadFile("Enya - Only Time (HAYASA G Remix) YELLOW GTR.mp3",width);
        ab=ap.mix;
        ap.play();
        colorMode(HSB);
        
        img = loadImage("chill.jpeg");
    }
    
}