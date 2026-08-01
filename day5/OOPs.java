class Bank {
    int balance;

    public Bank(int b) {
        this.balance = b;
    }

    public void showBalance() {
        System.out.println("Available Balance: " + this.balance);
    }
}

class Main {
    public static void main(String[] args) {
        Bank obj1 = new Bank(1000);
        obj1.showBalance();
    }
}
