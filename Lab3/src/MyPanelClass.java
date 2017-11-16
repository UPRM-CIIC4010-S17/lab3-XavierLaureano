import java.awt.Color;

import java.awt.Graphics;

import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;

 
public class MyPanelClass extends JPanel {
    private static final long serialVersionUID = 7057541440811488699L;
            public void paintComponent(Graphics g) {

                        super.paintComponent(g);

                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
                        
//                        Paint the background
                          g.setColor(Color.RED);
                          g.fillRect(x1, y1, width + 1, height + 1);
                       
                          g.setColor(Color.WHITE);
                          g.fillRect(0,50,width,50);
                          g.setColor(Color.WHITE);
                          g.fillRect(0,150,width,50);
                          
                          Polygon p3 = new Polygon();
                          p3.addPoint(x1, y1);
                          p3.addPoint(x1+160, y1+125);
                          p3.addPoint(x1, y1+240);
                          g.setColor(Color.BLUE);
                          g.fillPolygon(p3);
            
                          Polygon p2 = new Polygon();
                          p2.addPoint(x1 + 25, y1 + 113);
                          p2.addPoint(x1 + 41, y1 + 113);
                          p2.addPoint(x1 + 47, y1 + 98);
                          p2.addPoint(x1 + 53, y1 + 113);
                          p2.addPoint(x1 + 69, y1 + 113);
                          p2.addPoint(x1 + 56, y1 + 123);
                          p2.addPoint(x1 + 61, y1 + 138);
                          p2.addPoint(x1 + 47, y1 + 128);
                          p2.addPoint(x1 + 34, y1 + 138);
                          p2.addPoint(x1 + 38, y1 + 123);
                          g.setColor(Color.WHITE);
                          g.fillPolygon(p2);
            }

}