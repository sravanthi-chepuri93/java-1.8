public class Cylinder {
    private double radius;
    private double height;

    public double getRadius(){
        return radius;
    }
    public double getHeight(){
        return height;
    }
    public void setRadius(double r) {
        if(r>0)
            radius =r;
        else
            radius =0;
    }
    public void setHeight(double h){
        if(h>0)
            height = h;
        else
            height =0;
    }
    public void setDimensions(double r, double h){
       setRadius(r);
       setHeight(h);
    }
    public Cylinder(){
        radius =1;
        height =1;
    }
    public Cylinder(double r){
        radius = r;
        height = 1;
    }
    public Cylinder(double r, double h){
        setDimensions(r,h);
    }

    public double lidArea(){
        double lidArea = Math.PI* radius*radius;
        return lidArea;
    }
    public double circumference(){
        double circumference = 2 * Math.PI*radius*height;
        return circumference;

    }
    public double totalSurfaceArea(){
        double totalSurfaceArea = 2*lidArea()+ circumference()*height;
        return totalSurfaceArea;
    }
    public double Volume(){
        double volume = lidArea()*height;

        return volume;
    }


}
class CylinderTest{
    public static void main(String[] args){
        Cylinder c = new Cylinder();
        System.out.println(c.lidArea());
        System.out.println(c.totalSurfaceArea());
        System.out.println(c.Volume());


    }
}
