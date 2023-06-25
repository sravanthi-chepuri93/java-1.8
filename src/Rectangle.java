public class Rectangle {
    double breadth, length;
    public double area(){
        double area = breadth * length;
        return area;
    }
    public double perimeter(){
        double perimeter = 2*(breadth+length);
        return perimeter;
    }

    public boolean isSquare(){
        if(length == breadth)
            return true;
        else
            return false;
    }

}
class start{
    public static void main(String[] args){
        Rectangle rec = new Rectangle();
        Rectangle rec2 = new Rectangle();
        rec.length = 10;
        rec.breadth = 5;
        rec2.length = 20;
        rec2.breadth = 10;
        System.out.println(" area is"+rec.area());
        System.out.println(" perimeter is"+rec.perimeter());
        System.out.println("Is it a square --"+rec.isSquare());
        System.out.println(rec2.area());
        System.out.println(rec2.perimeter());
        System.out.println(rec2.isSquare());
    }

}
