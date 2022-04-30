

// Access Modifiers and Constuctors;
class Cylinder{
    private int radius;
    private int height;
// Inset Constructor;
    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceArea(){
        // Math.PI PI value;
        return  (2* Math.PI* radius*radius+2*Math.PI*radius*height);
    }
public double volume(){
    return  (Math.PI* radius*radius *height);
}
}

class Recttangel{
    private int lenght;
    private int breadth;

    public Recttangel() {
        this.lenght = 4;
        this.breadth = 5;
    }
    // Add Constructer;
    public Recttangel(int lenght, int breadth) {
        this.lenght = lenght;
        this.breadth = breadth;
    }
    // Add get;
    public int getLenght() {
        return lenght;
    }

    public int getBreadth() {
        return breadth;
    }
}

public class ConstructersQuestion {
    public static void main(String[] args) {
       // problem 1 insert getter and setter;
        Cylinder myCylinder=new Cylinder(9,12);  // Constructor done value

        //myCylinder.setHeight(12);
        System.out.println(myCylinder.getHeight());
      //  myCylinder.setRadius(9);
        System.out.println(myCylinder.getRadius());

        // proble 2-> use 1 to calculate surface area and volume of the surface;
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());

        // problem 3-> use3 a constructor and repeat;
        Recttangel r=new Recttangel();
        System.out.println(r.getLenght());
        System.out.println(r.getBreadth());
    }
}
