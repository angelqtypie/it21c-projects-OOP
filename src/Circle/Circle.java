package Circle;
class Circle {
    double r;
public double getRadius(){
    return r;
}
void setRadius(double y){
    r=y;
    System.out.println("Radius: " + r);
}
public double getArea(){
    return r;
}
void setArea (double newArea){
    newArea=(r*r)*Math.PI;
    System.out.println("Area: " + newArea);
}
}