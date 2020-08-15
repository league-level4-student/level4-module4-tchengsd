package _03_polymorphs;

import java.awt.Graphics;

import javax.swing.JPanel;

public abstract class Polymorph extends JPanel {
    private int x;
    private int y;
    private int width = 25;
    private int height = 25;
    
    public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
    }
    
    public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void update(){
   	 
    }
    
    public abstract void draw(Graphics g);
}
