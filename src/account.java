public class account {
    public long accountNumber;
    public String name;
    double balance;
    public double withdraw(int n){
        balance = balance-n;
        return balance;
    }
    public double deposit(int m){
        balance = balance+m;
        return balance;
    }
}
class accountTest{
    public static void main(String[] args){
        account a1 = new account();
        a1.name = "jj";
        a1.accountNumber= 456783456;
        a1.balance = 100;
        System.out.println(a1.withdraw(50));
        System.out.println(a1.deposit(300));

    }
}
