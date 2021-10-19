package Lesson11;

public class Car {
    public String color;
    public String engine;
    public int kolvoDoor;

    Car(String color, String engine, int kolvoDoor) {
        this.color = color;
        this.engine = engine;
        this.kolvoDoor = kolvoDoor;

    }
}

class CarTest {
    void MenyaetKolvoDverei(Car c, int kolvoDoor) {
        c.kolvoDoor = kolvoDoor;
    }


    void zamenaCveta(Car ct1, Car ct2) {
        String ct3 = ct1.color;
        ct1.color = ct2.color;
        ct2.color = ct3;
    }

    public static void main(String[] args) {
        CarTest c = new CarTest();
        Car c1 = new Car("green", "V6", 3);
        Car c2 = new Car("blue", "V8", 4);
        c.MenyaetKolvoDverei(c1,5);
        c.zamenaCveta(c1,c2);
        System.out.println("Pervyu mashiny perekrasili v " + c1.color + " cvet!");
        System.out.println("Vtoryu mashiny perekrasili v " + c2.color + " cvet!");
        System.out.println(c1.color + " mashine postavili dopolnitelno " + c1.kolvoDoor + " dverei!");
    }
}



