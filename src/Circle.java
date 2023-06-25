public class Circle {
    double radius;
    public double area(){
       double  area = Math.PI*radius*radius;
       return area;
    }
    public double perimeter(){
        double perimeter = 2*Math.PI*radius;
        return perimeter;
    }
    public double circumference(){
        return perimeter();
    }

}
 class run{
    public static void main(String[] args){
        Circle c1 = new Circle();
        Circle c2 = new Circle();

        c1.radius = 7;
        c2.radius = 14;
        System.out.println(c1.area());
        System.out.println(c1.perimeter());
        System.out.println(c1.circumference());

        System.out.println(c2.area());
        System.out.println(c2.perimeter());
        System.out.println(c2.circumference());

    }

}
