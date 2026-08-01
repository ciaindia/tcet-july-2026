class Hi extends Thread {
    public void run() {
        for(int i = 1; i <= 10; i++) {
            System.out.println("hi");
            try { Thread.sleep(1000); } catch(Exception e) {}
        }
    }
}
class Huku extends Thread {
    public void run() {
        for(int i = 1; i <= 10; i++) {
            System.out.println("huku");
            try { Thread.sleep(1000); } catch(Exception e) {}
        }
    }
}
class Main {
    public static void main(String[] args) throws Exception {
        Hi obj1 = new Hi();        obj1.start();
        Huku obj2 = new Huku();        obj2.start();
    }
}
