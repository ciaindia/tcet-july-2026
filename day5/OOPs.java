class Bank {
    int balance;

    public Bank(int b) {
        this.balance = b;
    }

    public void deposit(int amt) {
        this.balance = this.balance + amt;
    }

    public void showBalance() {
        System.out.println("Available Balance: " + this.balance);
    }
}


class SBI extends Bank {
    public SBI(int b) {
        super(b);
    }

    public void deposit(int amt) {
        this.balance = this.balance + (amt - 50);
    }

}


class Main {
    public static void main(String[] args) {
        Bank obj1 = new SBI(1000);
        obj1.showBalance();
        obj1.deposit(100);
        obj1.showBalance();
    }
}
