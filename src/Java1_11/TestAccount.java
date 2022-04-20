package Java1_11;

public class TestAccount {
    public static void main(String[] args) {
        Account acc1,acc2;
        acc1 = new Account("1", "Nguyen Viet Anh", 100);
        acc2 = new Account("2", "Le Hoang Minh", 200);
        System.out.println("ID: "+acc1.getId());
        System.out.println("Name: "+acc1.getName());
        System.out.println("Balance: "+acc1.getBalance());

        acc1.credit(20);
        acc1.debit(30);
        acc1.transferTo(acc2,50);
        System.out.println(acc1.toString());
    }
}
