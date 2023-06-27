public class Customer {
    private String customerId;
    private String name;
    private String address;
    private String phoneNumber;

    public Customer(String customerId, String name){
        this.customerId = customerId;
        this.name = name;
    }
    public Customer(String customerId, String name,String address,String phoneNumber){
        this.customerId = customerId;
        this.name = name;
        setAddress(address);
        setPhoneNumber(phoneNumber);
    }
    public String getCustomerId(){return customerId;}
    public String getName(){return name;}
    public String getAddress(){return address;}
    public String getPhoneNumber(){return phoneNumber;}

    public void setAddress(String address){
        this.address = address;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

}
class CustomerRegistration{
    public static void main(String[] args) {
        Customer c = new Customer("B12A13", "john");
        Customer c2 = new Customer("A12C34", "john", "3421 blueberry street", "+18923456742");
        System.out.println(c2.getName());
        System.out.println(c2.getCustomerId());
        System.out.println(c2.getAddress());
        System.out.println(c2.getPhoneNumber());
        c2.setPhoneNumber("+91 456123789");
        System.out.println(c2.getPhoneNumber());



    }

}
