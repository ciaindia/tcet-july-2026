import java.util.Scanner;

interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Draw a circle");
    }

}

class Triangle implements Shape {
    public void draw() {
        System.out.println("Draw a triangle");
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println("Draw a square");
    }
}

class Painter { //SPRING BOOT IOC
    private Shape s;
    public Painter(String shape) {
        if(shape.equals("circle")) {
            this.s = new Circle();
        } else if(shape.equals("triangle")) {
            this.s = new Triangle();
        } else if(shape.equals("square")) {
            this.s = new Square();
        }
    }

    public void setShape(String shape){
        if(shape.equals("circle")) {
            this.s = new Circle();
        } else if(shape.equals("triangle")) {
            this.s = new Triangle();
        } else if(shape.equals("square")) {
            this.s = new Square();
        }
    }

    public void paint() {
        s.draw();
    }
}



public class Main {
    public static void main(String[] args) {
     
        Painter p = null;
        
        System.out.println("Select shape: ");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Square");

        int choice = new Scanner(System.in).nextInt();

        //implement factory design pattern
        if(choice == 1) {
            p = new Painter("circle");
        } else if(choice == 2) {
            p = new Painter("triangle");
        } else if(choice == 3) {
            p = new Painter("square");
        }
        p.paint();

    }
}
