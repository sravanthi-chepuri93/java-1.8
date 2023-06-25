public class Cylinder {
    public double radius, height;
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
        Cylinder c1 = new Cylinder();
        c1.radius = 3;
        c1.height = 10;
        System.out.println("lidArea  "+c1.lidArea());
        System.out.println("circumference "+c1.circumference());
        System.out.println("total surface area "+c1.totalSurfaceArea());
        System.out.println("volume "+c1.Volume());



    }

}