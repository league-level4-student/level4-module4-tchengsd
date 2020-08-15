package _03_polymorphs;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageMorph extends Polymorph implements ImageObserver {

	ImageMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		BufferedImage img = null;
		try {
		    img = ImageIO.read(new File("wii.jpg"));
		} catch (IOException e) {
		}
		g.drawImage(img, getX(), getY(), this);
	}

	@Override
	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		// TODO Auto-generated method stub
		return false;
	}

}
