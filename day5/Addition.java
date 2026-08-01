//CW2: WAP to read 2 numbers from command line and print
//addition: 5 + 6 = 11
public class Addition {
    public static void main(String[] args) {
        int x,y,z;

        try {
            x = Integer.parseInt(args[0]);
            y = Integer.parseInt(args[1]);
            z = x + y;
            System.out.println(z);
        } catch (Exception e) {
            System.out.println("Please enter number in CLA");
        }
    }
}
