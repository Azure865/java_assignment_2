package QWE_E;

public class Account {
    String id;
    String name;
    int balance=0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String name, int balance, String id) {
        this.name = name;
        this.balance = balance;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int credit(int amount) {
        this.balance += amount;
        return this.balance;
    }
    public int debit(int amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        }else System.out.println("Amount Exceeded balance for debit");
        return this.balance;
    }
    public int transferto(Account another, int amount) {
        if (amount <= this.balance) {
            another.setBalance(another.balance+ amount);
            this.balance -= amount;
        }else System.out.println("Amount Exceeded balance for transfer");
        return this.balance;
    }
    public String toString(){
        return "id = "+id + "\n" + "Name = " + name + "\n" +"Balance = " + balance;
    }
    public static void main(String[] args) {

        Account acc1 = new Account("Ujan", 9000 , "1");
        Account acc2 = new Account("orish", 12000 , "2");

        System.out.println("Credit balance is = " + acc1.credit(200));
        System.out.println("Debit balance is = " + acc1.debit(2000));
        System.out.println("Transfer amount is = " + acc1.transferto(acc2,5000));

        System.out.println(acc1.toString());
        System.out.println(acc2.toString());
    }
}

