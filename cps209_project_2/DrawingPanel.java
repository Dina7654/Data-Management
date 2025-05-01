import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;


public class DrawingPanel extends JPanel{
        private ArrayList<MyShape> shapes = new ArrayList<MyShape>();
        private DrawingApp parentApp;

        /*
         * Constructor for the DrawingPanel class
         * initializes the panel, sets the background color
         * adds a mouse listener to draw shapes
         */
        public DrawingPanel(DrawingApp app){
            this.parentApp = app;
            setBackground(Color.WHITE);

            addMouseListener(new MouseAdapter(){
                @Override
                public void mousePressed(MouseEvent e){
                    String selectedShape = (String) parentApp.getShapeSelector().getSelectedItem();
                    Color selectedColor = parentApp.getCurrentColor();

                    if(selectedShape != null){
                        shapes.add(new MyShape(selectedShape, e.getX(), e.getY(), selectedColor));
                        repaint();
                    }
                }
            });
        }
        /*
         * This sets the drawing color
         * it is called when the "Choose a Color " button is clicked
         */
        public void setCurrentColor(Color color){
            this.currentColor = color;
        }

        /*
         * Clears the canvas by removing all shapes
         * this method also returns to it's original color (repainting it)
         * this happens when the user clicks the "Clear Canvas" button
         */
        public void clearCanvas(){
            shapes.clear();
            repaint();
        }

        
        /*
         * This repaints the panel whenever it's called
         * it iterates through the shapes and draws and paints 
         * whichever one is chosen
         */
        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);

            for(MyShape shape: shapes){
                g.setColor(shape.getColor());

                switch(shape.getType()){

                    case "Circle":
                    g.fillOval(shape.getX()-25, shape.getY()-25,50,50);
                    break;

                    case "Rectangle":
                    g.fillRect(shape.getX()-25, shape.getY()-25,50,50);
                    break;

                    case "Line":
                    g.drawLine(shape.getX()-25, shape.getY()-25, shape.getX()+25, shape.getY()+25);
                    break;
                }
            }
        }


    }


