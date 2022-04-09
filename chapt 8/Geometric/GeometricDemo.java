

public class GeometricDemo {

    public static void main(String[] args) {
        

        // creating an instance of the class 

        Geometric test = new Geometric(); 

        double pi = Math.PI; 
        double r = 6.3; 
        int l = 10; 
        int w = 13; 
        int h = 8; 

        
        test.getWidth(w);
        test.getHeight(h);
        test.getLenght(l);
        test.getRadius(r);
        
        // calculate area for circle
        test.calArea(pi, test.setRadius()); 
        
        // calculate area of a rectangle
        test.calArea(test.setWidth(), test.setLenght());

        // calculate area of a cylinder
        test.calArea(pi, test.setRadius(), test.setHeight());


    
        
        

    }
    
}
