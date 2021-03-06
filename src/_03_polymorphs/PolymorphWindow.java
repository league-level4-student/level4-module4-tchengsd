package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseMotionListener, MouseListener {
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    JPanel click = new JPanel();
    
    ArrayList<Polymorph> morphs = new ArrayList<Polymorph>();
    
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 this.add(click);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 window.addMouseMotionListener(this);
   	 window.addMouseListener(this);
   	 
   	 morphs.add(new RedMorph(64, 73));
   	 morphs.add(new RedMorph(342, 230));
   	 morphs.add(new BluePolymorph(190, 356));
   	 morphs.add(new BluePolymorph(22, 99));
   	 morphs.add(new MovingMorph(0, 0));
   	 morphs.add(new MovingMorph(100, 50));
   	 morphs.add(new CircleMorph(200, 200));
   	 morphs.add(new MouseMorph(100, 100));
   	 morphs.add(new ImageMorph(245, 146));
   	 morphs.add(new ClickMorph(150, 150));
   	 
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	
   	 //draw polymorph
   	 for(Polymorph morph : morphs) {
   		 morph.draw(g);
   	 }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
   	 for(Polymorph morph : morphs) {
   		 morph.update();
   	 }
    }

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		for(Polymorph morph : morphs) {
	   		if(morph instanceof MouseMorph) {
	   			morph.setX(arg0.getX());
	   			morph.setY(arg0.getY());
	   		}
	   	 }
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		for(Polymorph morph : morphs) {
			if(morph instanceof ClickMorph) {
				int mx = morph.getX();
				int my = morph.getY();
				int ex = e.getX();
				int ey = e.getY();
				if(ex >= mx && ex <= mx + morph.getWidth() && ey >= my && ex <= my + morph.getHeight()) {
					JOptionPane.showMessageDialog(null, "clicked");
				}
			}
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
