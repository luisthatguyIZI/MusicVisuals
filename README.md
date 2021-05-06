# Music Visualiser Project

Name: Luis Fernando Grand

Student Number: C19403516

## Instructions
- Fork this repository and use it a starter project for your assignment
- Create a new package named your student number and put all your code in this package.
- You should start by creating a subclass of ie.tudublin.Visual
- There is an example visualiser called MyVisual in the example package
- Check out the WaveForm and AudioBandsVisual for examples of how to call the Processing functions from other classes that are not subclasses of PApplet

# Description of the assignment
In this assignment I will showcase the use of various audio visualisation effects using Java processing libraries 

# Instructions
To run the program click the run code button.
There is a selection of 7 visuals.To change them press any key from 0-6
Enjoy the show :)

# How it works
The program is quite simple to use. Once the user executes the code a new display will open.
The mp3 file selected will start playing automatically.
The user will then be able to pick from a selection of 7 effects.
Each effect has a number key assigned to it.This is done using the switch().

# What I am most proud of in the assignment
The parts that I am most proud of in this assignment are the 4th and 5th effect that I implemented. Even though they are really simple the 4th effect with the circle and the line 
have a nice synergy that go well with the background image. Also the 5th effect with the square layers creates calm atmosphere which in my opinion is important when listning to music and it was what I was aming for to achieve in this assignment.

# Markdown Tutorial

This is *emphasis*

This is a bulleted list

- Item
- Item

This is a numbered list

1. Item
1. Item

This is a [hyperlink](http://bryanduggan.org)

# Headings
## Headings
#### Headings
##### Headings

This is code:

```Java
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

So is this without specifying the language:

```
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```
These are some pictures showcaseing the different effects in the program:

The line effect
![An image](images/effect1.png)

The hourglass effect
![An image](images/effect0.png)

The wallmount effect
![An image](images/effect2.png)

The line & circlue effect
![An image](images/effect3.png)

The Sqaure Layers effect
![An image](images/effect4.png)

The All Seeing Eye effect
![An image](images/effect5.png)

The Tunnel effect
![An image](images/effect6.png)


This is a youtube video:

[![YouTube](https://i9.ytimg.com/vi_webp/vsD3EG1qFpI/mqdefault.webp?time=1620312000000&sqp=CMD_z4QG&rs=AOn4CLAPhVK1yEPG9U_b426C84qVK9JfCw)](https://www.youtube.com/channel/UC6raEfnkDjZDcYcDrAFm3cg/videos?view=0&sort=dd&shelf_id=0)

This is a table:

| Heading 1 | Heading 2 |
|-----------|-----------|
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |

