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
    float lerpedAverage = 0;
    float[] lerpedBuffer;

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

    public void draw() {
        image(img, 0, 0);
        stroke(255);
        float halfHeight = height / 2;
        float average = 0;
        float sum = 0;

        // Calculate the average of the buffer
        for (int i = 0; i < ab.size(); i ++)
        {
            sum += abs(ab.get(i));
        }
        average = sum / ab.size();
        // Move lerpedAverage 10% closer to average every frame
        lerpedAverage = lerp(lerpedAverage, average, 0.1f);

        for (int i = 0; i < ab.size(); i++) {

            float c = map(i, 0, ab.size(), 0, 255);
            stroke(c, 255, 255);
            lerpedBuffer[i] = lerp(lerpedBuffer[i], ab.get(i), 0.1f);        
            line(i, halfHeight - lerpedBuffer[i] * halfHeight * 4, i, halfHeight + lerpedBuffer[i] * halfHeight * 4);
        }        
    }
    
}