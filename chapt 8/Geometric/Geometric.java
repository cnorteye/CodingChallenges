
public class Geometric {

    /*
        write a class that has three overloaded static methods for calculating the areas of the following geometric shapes: 
            - circles
            - rectangles 
            - cylinders
    */
    

    // fields
    private double pi; 
    private double radius;
    private int width;
    private int lenght;
    private int height;


    // getters

    public void getPI(double pie){
        pi = pie;
    }

   public void getRadius(double r){
      radius = r;
   }

   public void getWidth(int w){
       width = w; 
    }

   public void getLenght(int l){
      lenght = l;
    }
    
   public void getHeight(int h){
       height = h; 
    }

        //setters
     public double setPI(){
         return pi; 
     }

    public double setRadius(){
       return radius;
    }

    public int setWidth(){
        return width; 
     }

    public int setLenght(){
       return lenght;
     }

    public int setHeight(){
        return height; 
     }


    // method to calcualte area for circle

    public void calArea(double pi,  double radius){
        double areaOfCircle = pi * Math.pow(radius, 2);

        System.out.println("The area of a CIRCLE is " +  areaOfCircle);
    }

    // method to calcualte area for rectangle

    public void calArea(int width,  int lenght){
        double areaOfRectangle = width * lenght;

        System.out.println("The area of a RECTANGLE is " + areaOfRectangle); 
    }


   // method to calcualte area for circle

   public void calArea(double pi,  double radius, int height){
    double areaOfCylinder = pi * Math.pow(radius, 2) * height;

   System.out.println("The area of a CYLINDER is " + areaOfCylinder);
} 






}
