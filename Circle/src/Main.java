public class Main {
    public static void main(String[] args){
        Circle circle = new Circle(4,"Blue");
        System.out.println(circle);
        circle.setColor("Green");
        circle.setRadius(10);
        System.out.println(circle);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Color: " + circle.getColor());
        System.out.println("Area: " + circle.getArea());
        Cylinder cylinder = new Cylinder(9,4,"Purple");
        System.out.println(cylinder);
        cylinder.setHeight(14);
        cylinder.setColor("Beige");
        cylinder.setRadius(12);
        System.out.println(cylinder);
        System.out.println("Radius: " + cylinder.getRadius());
        System.out.println("Height: "+cylinder.getHeight());
        System.out.println("Color: " + cylinder.getColor());
        System.out.println("Volume: " + cylinder.getVolume());
    }
}
class Circle{
    private double radius = 1.0;
    private String color = "red";
    Circle(){}
    Circle(double radius){this(radius, "red");}
    Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {this.color = color;}
    public double getArea(){return Math.PI * Math.pow(radius,2);}
    public String toString(){
        return "Circle[radius=" + getRadius() + ",color="+getColor()+"]";
    }
}
class Cylinder extends Circle{
    private double height = 1.0;
    Cylinder(){}
    Cylinder(double radius){
        this(radius, 1.0);
    }
    Cylinder(double radius, double height){
        this(radius, height, "red");
    }
    Cylinder(double radius, double height, String color){
        super(radius,color);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() + "height="+getHeight();
    }
}