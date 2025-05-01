import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class DrawingApp extends JFrame{
    private DrawingPanel drawingPanel;
    private JComboBox<String> shapeSelector;
    private JButton clearButton;
    private JButton colorButton;
    private Color currentColor = Color.BLACK;

    /*
     * Constructor of the DrawingApp class
     * intitializes the main frame of the app
     * this also sets the GUI components needed and the event listeners 
     * to draw and choose colors and shapes
     */
    public DrawingApp(){
        setTitle("Drawing App");
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel controlPanel = new JPanel();
        shapeSelector = new JComboBox<>(new String[]{"Circle", "Rectangle", "Line"});
        clearButton = new JButton("Clear Canvas");
        colorButton = new JButton("Choose Color");
        controlPanel.add(new JLabel("Select Shape: "));
        controlPanel.add(shapeSelector);
        controlPanel.add(clearButton);
        controlPanel.add(colorButton);
        add(controlPanel, BorderLayout.NORTH);

        drawingPanel = new DrawingPanel(this);
        add(drawingPanel, BorderLayout.CENTER);

        clearButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                drawingPanel.clearCanvas();
            }
        });

        colorButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                chooseColor();
            }
        });

        setVisible(true);
    }

    /*
     * This opens a color picker dialog box and sets the current drawing color
     * updates the color the user is draiwng with
     */
    private void chooseColor(){
        Color newColor = JColorChooser.showDialog(this, "Choose a Color", currentColor);
        if(newColor == null){
            newColor = Color.BLACK;
            
        }
        currentColor = newColor;
        drawingPanel.setCurrentColor(currentColor);
    }
    /*
     * Returns the JComboBox containing the shapes
     * This is used by the DrawingPanel class to access the selected shape
     */
    public JComboBox<String> getShapeSelector(){
        return shapeSelector;
    }

    /*
     * Returns the current drawing color
     * This is used by the DrawingPanel class to get the selected color
     */
    public Color getCurrentColor(){
        return currentColor;
    }

}