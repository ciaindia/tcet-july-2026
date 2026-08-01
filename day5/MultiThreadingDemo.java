class Hi {
    public void run() throws Exception {
        for(int i = 1; i <= 10; i++) {
            System.out.println("hi");
            Thread.sleep(1000);
        }
    }
}
class Huku {
    public void run() throws Exception {
        for(int i = 1; i <= 10; i++) {
            System.out.println("huku");
            Thread.sleep(1000);
        }
    }
}
class Main {
    public static void main(String[] args) throws Exception {
        Hi obj1 = new Hi();
        obj1.run();
        Huku obj2 = new Huku();
        obj2.run();
    }
}
