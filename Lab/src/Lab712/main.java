package Lab712;

public class main {
    public static void main(String[] args) {
        Bank bank = new Bank("Sacombank");

        bank.addBranch("HCM");

        bank.addCustomer("Thuan", "HCM", 50.05);
        bank.addCustomer("Thu", "HCM", 153.12);
        bank.addCustomer("Thao", "HCM", 192.12);

        bank.addBranch("Lam Dong");
        bank.addCustomer("Bo", "Lam Dong", 999.99);

        bank.addCustomerTransaction("Thuan", "HCM", 123.123);
        bank.addCustomerTransaction("Thuan", "HCM", 128.127);
        bank.addCustomerTransaction("Bo", "Lam Dong", 188.197);

//        bank.listCustomer("HCM", false);
        bank.listCustomer("HCM", true);
//        bank.listCustomer("Lam Dong", true);

        bank.addBranch("DN");
        if (!bank.addBranch("DN")){
            System.out.println("exists");
        }
        if (!bank.addCustomer("Thuan", "DN", 50.05)){
            System.out.println("error");
        }
    }
}
