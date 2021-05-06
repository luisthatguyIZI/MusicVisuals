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
    float y = 200;
    float lerpedY = y;
    int which = 0;

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
        lerpedBuffer = new float[width];
        img = loadImage("chill.jpeg");
    }

    public void keyPressed() {
        if (keyCode >= '0' && keyCode <= '6') {
            which = keyCode - '0';
        }
        if (keyCode == ' ') {
            if (ap.isPlaying()) {
                ap.pause();
            } else {
                ap.rewind();
                ap.play();
            }
        }
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

        switch (which)
        {
            case 0:
            {
                // Iterate over all the elements in the audio buffer
                for (int i = 0; i < ab.size(); i++) {

                    float c = map(i, 0, ab.size(), 0, 255);
                    stroke(c, 255, 255);
                    lerpedBuffer[i] = lerp(lerpedBuffer[i], ab.get(i), 0.1f);        
                    line(i, halfHeight - lerpedBuffer[i] * halfHeight * 4, i, halfHeight + lerpedBuffer[i] * halfHeight * 4);
                }        
                break;
            }   
            case 1:
            {
                // Iterate over all the elements in the audio buffer
                for (int i = 0; i < ab.size(); i++) {

                    float c = map(i, 0, ab.size(), 0, 255);
                    stroke(c, 255, 255);
                    lerpedBuffer[i] = lerp(lerpedBuffer[i], ab.get(i), 0.1f);
        
                    line(i, halfHeight - lerpedBuffer[i] * halfHeight * 5, halfHeight + lerpedBuffer[i] * halfHeight * 5, i);
                }        
                break;
            }
            case 2:
            {
                for (int i = 0; i < ab.size(); i++) {

                    float c = map(i, 0, ab.size(), 0, 255);
                    stroke(c, 255, 255);
                    lerpedBuffer[i] = lerp(lerpedBuffer[i], ab.get(i), 0.1f);        
                    line(0, i, lerpedBuffer[i] * halfHeight * 4, i);
                    line(width, i, width - (lerpedBuffer[i] * halfHeight * 4), i);
                    line(i, 0, i, lerpedBuffer[i] * halfHeight * 4);
                    line(i, height, i, height - (lerpedBuffer[i] * halfHeight * 4));
                }        
                break;
            }
            case 3:
            {
                float c = map(average, 1, 0, 1, 255);
                stroke(c, 255, 255);        
                strokeWeight(2);
                fill(255,255,255);
                ellipse(width / 2, 200, 50 + (lerpedAverage * 600), 50 + (lerpedAverage * 600));
                for (int i = 0; i < ab.size(); i++) {

                    float x = map(i, 0, ab.size(), 0, 255);
                    stroke(c, 255, 255);
                    lerpedBuffer[i] = lerp(lerpedBuffer[i], ab.get(i), 0.1f);        
                    line(i, halfHeight - lerpedBuffer[i] * halfHeight * 2, i, halfHeight + lerpedBuffer[i] * halfHeight * 2);
                } 
                
                
                           
                break;
            }
            
        }        
    }
    
}