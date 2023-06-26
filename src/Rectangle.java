public class Rectangle {

    private int length;
    private int breadth;
    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
    public void setLength(int l){
        if(l>0)
            length = l;
        else
            length =0;

    }
    public void setBreadth(int b){
        if(b>0)
            breadth = b;
        else
            breadth = 0;
    }

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
        rec.setLength(10);
        rec.setBreadth(5);
        System.out.println(rec.getLength());
        System.out.println(rec.getBreadth());
        System.out.println(rec.area());
        System.out.println(rec.perimeter());
        System.out.println(rec.isSquare());



    }

}
