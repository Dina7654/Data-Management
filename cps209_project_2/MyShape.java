public class MyShape{
    private String type;
    private int x, y;
    private Color color;

    /*
     * Constructor for the MyShape class
     * initializes the type of shape (circle, rectangle, line)
     * intializes the color of the type
     * initializes the x and y coordinate of the shape
     */
    public MyShape(String type, int x, int y, Color color){
        this.type = type;
        this.x = x;
        this.y = y;
        this.color = color;
    }

    /*
     * Returns the type of shape
     */
    public String getType(){
        return type;
    }

    /*
     * Returns the x-coordinate of the shape
     */
    public int getX(){
        return x;
    }

    /*
     * Returns the y-coordinate of the shape
     */
    public int getY(){
        return y;
    }

    /*
     * Returns the color of the shape
     */
    public Color getColor(){
        return color;
    }
}
