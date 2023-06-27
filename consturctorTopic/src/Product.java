public class Product {
    private String itemNo;
    private String name;
    private double price;
    private short qty;
    public Product(String itemNo){
        this.itemNo = itemNo;

    }
    public Product(String itemNo, String name){
        this.itemNo = itemNo;
        this.name = name;
    }
    public Product(String itemNo, String name, double price,short qty){
        this.itemNo = itemNo;
        this.name = name;
        setPrice(price);
        setQty(qty);
    }
    public String getItemNo(){ return itemNo;}
    public String getName(){ return name;}
    public double getPrice(){ return price;}
    public short getQty(){return qty;}

    public void setPrice(double price){
        this.price = price;
    }
    public void setQty(short qty){
        this.qty = qty;
    }

}

class scoops{
    public static void main(String[] args){
        Product p = new Product("A2723");
        Product p1 =new Product("B24-56","shirt");
        Product p2 = new Product("w345", " tooth brush", 34, (short) 100);
        p2.getItemNo();
        p2.getName();
        p2.getQty();

    }
}
