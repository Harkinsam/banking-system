import com.timbuchalka.Account;
import com.timbuchalka.VipCustomer;

public class Main {
    public static void main(String[] args) {
     Account samAccount  = new Account("12345", 50.5, "Samson", "sam@gmail.com",
             "081-6886-4996");
     Account olaAccount = new Account("6464646",1000, "ola",
             "god@gmail.com", "090737564");
     samAccount.deposit(50);
     samAccount.deposit((1000));
     samAccount.withdraw(25);
     olaAccount.withdraw(1000);
     System.out.println(olaAccount.getBalance());
     System.out.println(olaAccount.getCustomerName());
     System.out.println(samAccount.getCustomerName());
     olaAccount.setCustomerName("olaoluwa");
     System.out.println(olaAccount.getCustomerName());

     Account timsAccount = new Account("Tim", "tim@gmail.com","12345");
     System.out.println(timsAccount.getNumber() + "name" + timsAccount.getCustomerName());

     VipCustomer vip = new VipCustomer();
     System.out.println(vip.name());

     VipCustomer vip1 = new VipCustomer("tolu",506, "good@gmail.com");
     System.out.println(vip1.name() + vip1.creditLimit() + vip1.emailAddress());

     VipCustomer vip2 = new VipCustomer("sola", 459);
     System.out.println(vip2.name() + " " + vip2.creditLimit() + " " + vip2.emailAddress());

    }
}