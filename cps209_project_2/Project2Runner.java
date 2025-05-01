import javax.swing.SwingUtilities;

public class Project2Runner {
    
    /*
     * Name: Dina Dehghani
     * Student ID: 501314475
     * 
     ******** Project Description ********
     * This project is an interactive dawing app using Java Swing and 2D graphics.
     * The user interface allows the user to slect a shape between a circle, rectangle and line
     * using a dropdown menu, they can select a color using a button that opens a JColorChooser, and
     * they are able to draw the selected shape on a canvas by clicking the mouse. The drawing canvas
     * is created by using a JPanel subclass called DrawingPanel. The user can also clear the canvas by
     * clicking the "Clear Canvas" button. The shapes are drawn by where the mouse is clickes and it is 
     * stored in and ArrayList.
     *  
     ******** Swing Requirement ********
     * The program uses 3 Swing components: JComboBox, JButton, and JPanel.
     * The JComboBox is for selecting the shape which I used in the DrawingApp.java class.
     * The JButton is for the "Clear Canvas" button which is also in the DrawingApp.java class,
     * and this is used to clear the entire canvas. I also used the JButton for "Choose Color"
     * which i used in the DrawingApp.java class to allow the user to choose a color to draw with.
     * All of these are added to the control panel.
     * 
     ******** 2D Graphics Requirement ********
     * The drawing is created in a JPanel called DrawingPanel in the DrawingPanel.java class.
     * In the DrawingPanel.java class, there method paintComponent(Graphics g) is overriden to iterate
     * through all the shapes that is stored in the shapes ArrayList and it is used to draw them on the canvas
     * using methods from the Graphics class. 
     * 
     ******** Event Listener Requirement ********
     * This program includes multiple event listeners:
     * There is an ActionListener for the "Clear Canvas" button in DrawingApp.java.
     * There is another ActionListener for the "Choose Color" button also in DrawingApp.java.
     * There is a MouseListener (MouseAdapter) to see when the mouse clicks the canvas to add a shape
     * which is in DrawingPanel.java
     * These listeners make sure that the user's actions update the canvas.
     */

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                new DrawingApp();
            }
        });
    }
}
